package com.lzxx.common.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 数据库配置类
 * @date 2021/2/21
 */
@Configuration
@Data
public class DbConfig {

    /**
     * 数据库驱动
     */
    public static String driver;
    /**
     * 数据库连接
     */
    public static String url;
    /**
     * 数据库登录名
     */
    public static String username;
    /**
     * 数据库密码
     */
    public static String password;

    /**
     * 数据库驱动
     * @param driver2 驱动名
     */
    @Value("${spring.datasource.driver-class-name}")
    private void setDriver(String driver2) {
        driver = driver2;
    }

    /**
     * 数据库连接
     * @param url2 连接
     */
    @Value("${spring.datasource.url}")
    private void setUrl(String url2) {
        url = url2;
    }

    /**
     * 数据库登录名
     * @param userName2 登录名
     */
    @Value("${spring.datasource.username}")
    private void setUsername(String userName2) {
        username = userName2;
    }

    /**
     * 数据库登录名
     * @param password2 密码
     */
    @Value("${spring.datasource.password}")
    private void setPassword(String password2) {
        password = password2;
    }

}
