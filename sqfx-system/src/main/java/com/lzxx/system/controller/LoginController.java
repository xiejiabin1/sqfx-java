package com.lzxx.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.lzxx.common.config.Wxconfig;
import com.lzxx.common.result.ResultJSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 登陆 前端控制器
 * @date 2021/2/22
 */
@Api("登陆controller")
@RestController
@RequestMapping("/login")
public class LoginController {

    @ApiOperation(value = "解密用户敏感数据",httpMethod = "POST")
    @PostMapping("decodeUserInfo")
    public ResultJSON decodeUserInfo(@ApiParam(value = "加密数据",name = "encryptedData",required = true) String encryptedData,
                                                         @ApiParam(value = "加密算法的初始向量",name = "iv",required = true) String iv,
                                                         @ApiParam(value = "登陆凭证",name = "code",required = true) String code){
        //向微信服务器 使用登录凭证 code 获取 session_key 和 openid
        //请求参数
        String params = "appid=" + Wxconfig.wxspAppid + "&secret=" + Wxconfig.wxspSecret + "&js_code=" + code + "&grant_type=" + Wxconfig.grant_type;
        //发送请求
        String sr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
        //解析相应内容（转换成json对象）
        JSONObject json = JSONObject.fromObject(sr);
        //获取会话密钥（session_key）
        String session_key = json.get("session_key").toString();
        //用户的唯一标识（openid）
        String openid = (String) json.get("openid");
        return null;
    }
}
