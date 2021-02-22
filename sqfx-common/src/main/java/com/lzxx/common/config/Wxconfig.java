package com.lzxx.common.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 小程序配置参数
 * @date 2021/2/22
 */
@Configuration
@Data
public class Wxconfig {
    /**
     * 小程序唯一标识
     */
    public static String wxspAppid;

    /**
     * 小程序的密钥
     */
    public static String wxspSecret;

    /**
     * 授权
     */
    public static String grant_type;

    @Value("${wx.wxspAppid}")
    public void setWxspAppid(String appid) {
        wxspAppid = appid;
    }

    @Value("${wx.wxspSecret}")
    public void setWxspSecret(String secret) {
        wxspSecret = secret;
    }

    @Value("${wx.grant_type}")
    public void setGrant_type(String type) {
        grant_type = type;
    }
}
