package com.lzxx.system.controller;


import com.lzxx.common.result.ResultJSON;
import com.lzxx.system.model.entity.Identity;
import com.lzxx.system.service.IIdentityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 身份类型信息表 前端控制器
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2021-03-01
 */
@Api("身份类型controller")
@RestController
@RequestMapping("/system/identity")
public class IdentityController {

    @Resource
    private IIdentityService identityService;

    @ApiOperation(value = "查询所有身份类型",httpMethod = "GET")
    @GetMapping("/selectAllIdentity")
    public ResultJSON<List<Identity>> selectAllIdentity(){
        return ResultJSON.success(identityService.list()).message("查询所有身份类型");
    }
}
