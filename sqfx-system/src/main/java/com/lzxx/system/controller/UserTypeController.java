package com.lzxx.system.controller;


import com.lzxx.common.result.ResultJSON;
import com.lzxx.system.model.entity.Certificate;
import com.lzxx.system.model.entity.UserType;
import com.lzxx.system.service.ICertificateService;
import com.lzxx.system.service.IUserService;
import com.lzxx.system.service.IUserTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户类型表 前端控制器
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2021-03-01
 */
@Api("用户类型controller")
@RestController
@RequestMapping("/system/user-type")
public class UserTypeController {
    @Resource
    private IUserTypeService userTypeService;

    @ApiOperation(value = "查询所有用户类型",httpMethod = "GET")
    @GetMapping("/selectAllUserType")
    public ResultJSON<List<UserType>> selectAllUserType(){
        return ResultJSON.success(userTypeService.list()).message("查询所有用户类型");
    }
}
