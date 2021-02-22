package com.lzxx.common.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 系统参数配置类
 * @date 2021/2/21
 */
@Configuration
@Data
public class SystemConfig {

    /**
     * 系统名称
     */
    public static String fullName;

    /**
     * 系统简称
     */
    public static String nickName;

    /**
     * 系统版本号
     */
    public static String version;

    /**
     * 作者
     */
    public static String author;

    /**
     * 系统名称
     * @param name 名称
     */
    @Value("${system.fullName}")
    public void setFullName(String name) {
        fullName = name;
    }

    /**
     * 系统简称
     * @param name 名称
     */
    @Value("${system.nickName}")
    public void setNickName(String name) {
        nickName = name;
    }

    /**
     * 系统版本号
     * @param ver 版本号
     */
    @Value("${system.version}")
    public void setVersion(String ver) {
        version = ver;
    }

    /**
     * 系统作者
     * @param au 作者
     */
    @Value("${system.author}")
    public void setAuthor(String au) {
        author = au;
    }
}
