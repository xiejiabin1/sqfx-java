package com.lzxx.system.controller;


import com.lzxx.system.service.IUserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2021-02-24
 */
@Api("用户controller")
@RestController
@RequestMapping("/system/user")
@Slf4j
public class UserController {
    @Resource
    private IUserService userService;



}
