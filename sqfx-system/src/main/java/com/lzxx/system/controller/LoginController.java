package com.lzxx.system.controller;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.lzxx.common.config.Wxconfig;
import com.lzxx.common.exception.MyException;
import com.lzxx.common.result.ResultCodeEnum;
import com.lzxx.common.result.ResultJSON;
import com.lzxx.common.utils.AESUtil;
import com.lzxx.common.utils.HttpUtil;
import com.lzxx.system.model.dto.UserInfoDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class LoginController {

    @ApiOperation(value = "解密用户敏感数据",httpMethod = "POST")
    @PostMapping("/decodeUserInfo")
    public ResultJSON<UserInfoDto> decodeUserInfo(@ApiParam(value = "加密数据",name = "encryptedData",required = true) String encryptedData,
                                                  @ApiParam(value = "加密算法的初始向量",name = "iv",required = true) String iv,
                                                  @ApiParam(value = "登陆凭证",name = "code",required = true) String code){
        //向微信服务器 使用登录凭证 code 获取 session_key 和 openid
        //请求参数
        String params = "appid=" + Wxconfig.wxspAppid + "&secret=" + Wxconfig.wxspSecret + "&js_code=" + code + "&grant_type="+Wxconfig.grant_type;
        //发送请求
        String s = HttpUtil.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
        //解析相应内容（转换成json对象）
        JSONObject jsonObject = JSONObject.parseObject(s);

        //获取会话密钥（session_key）
        String session_key = jsonObject.getString("session_key");
        //用户的唯一标识（openid）
        String openid = jsonObject.getString("openid");
        String unionid = jsonObject.getString("unionid");

        try{
            //对encryptedData加密数据进行AES解密
            String result = AESUtil.decryptGet(encryptedData,session_key,iv);
            JSONObject userInfoJSON = JSONObject.parseObject(result);

            if (!StringUtils.isEmpty(result) && result.length()>0){
                UserInfoDto userInfo = new UserInfoDto();

                userInfo.setGender(userInfoJSON.getInteger("gender"));
                if(userInfo.getGender() == 1){
                    userInfo.setSex("男");
                }else if(userInfo.getGender() == 2){
                    userInfo.setSex("女");
                }

                if(unionid!=null){
                    userInfo.setUnionid(unionid);
                }else{
                    userInfo.setUnionid(null);
                }

                userInfo.setSession_key(session_key);
                userInfo.setOpenid(openid);
                userInfo.setAvatarUrl(userInfoJSON.getString("avatarUrl"));
                userInfo.setNickName(userInfoJSON.getString("nickName"));
                userInfo.setCity(userInfoJSON.getString("city"));
                userInfo.setProvince(userInfoJSON.getString("province"));
                userInfo.setCountry(userInfoJSON.getString("language"));

                return ResultJSON.success(userInfo).message("根据登陆凭证解密用户敏感数据");
            }
        }catch (Exception e){
            log.error(ResultCodeEnum.FAIL_DECODE.getMessage());
        }
        throw new MyException(ResultCodeEnum.FAIL_DECODE);
    }
}
