package com.lzxx.system.controller;


import com.lzxx.common.result.ResultJSON;
import com.lzxx.system.model.entity.Certificate;
import com.lzxx.system.service.ICertificateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 证件类型表 前端控制器
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2021-03-01
 */
@Api("证件类型controller")
@RestController
@RequestMapping("/system/certificate")
public class CertificateController {

    @Resource
    private ICertificateService certificateService;

    @ApiOperation(value = "查询所有证件类型",httpMethod = "GET")
    @GetMapping("/selectAllCertificate")
    public ResultJSON<List<Certificate>> selectAllCertificate(){
        return ResultJSON.success(certificateService.list()).message("查询所有证件类型");
    }
}
