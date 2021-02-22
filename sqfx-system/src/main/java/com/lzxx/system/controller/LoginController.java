package com.lzxx.system.controller;

import com.lzxx.common.result.ResultJSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 登陆 前端控制器
 * @date 2021/2/22
 */
@Api("登陆前端控制器")
@RestController
@RequestMapping("/login")
public class LoginController {

    @ApiOperation(value = "解密用户敏感数据",httpMethod = "POST")
    @PostMapping("decodeUserInfo")
    public ResultJSON decodeUserInfo(@ApiParam(value = "加密数据",name = "encryptedData",required = true) String encryptedData,
                                                         @ApiParam(value = "加密算法的初始向量",name = "iv",required = true) String iv,
                                                         @ApiParam(value = "登陆凭证",name = "code",required = true) String code){
        return null;
    }
}
