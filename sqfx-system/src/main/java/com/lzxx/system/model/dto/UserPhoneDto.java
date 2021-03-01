package com.lzxx.system.model.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 用户绑定的手机号等数据
 * @date 2021/2/23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserPhoneDto对象", description="用户手机号数据")
public class UserPhoneDto {

    @ApiModelProperty(value = "没有区号的手机号")
    @TableField("purePhoneNumber")
    private String purePhoneNumber;

    @ApiModelProperty(value = "用户绑定的手机号（国外手机号会有区号）")
    @TableField("phoneNumber")
    private String phoneNumber;

    @ApiModelProperty(value = "区号")
    @TableField("countryCode")
    private String countryCode;
}
