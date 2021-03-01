package com.lzxx.common.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @description: 数据库链接池druid监控平台的配置
 * 访问路径 http://localhost:5000/druid/index.html（本机）
 * @author: 先谢郭嘉
 **/
@Configuration
public class DruidConfig {

    @Value("${spring.datasource.druid.statViewServlet.loginUsername}")
    private String loginUsername;

    @Value("${spring.datasource.druid.statViewServlet.loginPassword}")
    private String loginPassword;

    @Value("${spring.datasource.druid.statViewServlet.allow}")
    private String allow;

    @Value("${spring.datasource.druid.statViewServlet.deny}")
    private String deny;

    @Value("${spring.datasource.druid.statViewServlet.resetEnable}")
    private String resetEnable;

    @Value("${spring.datasource.druid.statViewServlet.urlMappings}")
    private String urlMappings;

    @Value("${spring.datasource.druid.webStatFilter.url-pattern}")
    private String urlPattern;

    @Value("${spring.datasource.druid.webStatFilter.exclusions}")
    private String exclusions;


    /**
     * 配置参数，不然application.yml中的配置不生效
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druid(){
        return new DruidDataSource();
    }

    /**
     * 监控.
     * @return
     */
    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), urlMappings);
        // IP白名单
        servletRegistrationBean.addInitParameter("allow", allow);
        // IP黑名单(共同存在时，deny优先于allow)
        servletRegistrationBean.addInitParameter("deny", deny);
        //控制台管理用户
        servletRegistrationBean.addInitParameter("loginUsername", loginUsername);
        servletRegistrationBean.addInitParameter("loginPassword", loginPassword);
        //是否能够重置数据 禁用HTML页面上的“Reset All”功能
        servletRegistrationBean.addInitParameter("resetEnable", resetEnable);
        return servletRegistrationBean;
    }

    /**
     * 过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        //添加过滤规则
        filterRegistrationBean.addUrlPatterns(urlPattern);
        //添加不需要忽略的格式信息
        filterRegistrationBean.addInitParameter("exclusions", exclusions);
        return filterRegistrationBean;
    }
}
