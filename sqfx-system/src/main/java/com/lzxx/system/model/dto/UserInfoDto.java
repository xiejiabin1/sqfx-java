package com.lzxx.system.model.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 解密后的用户敏感数据
 * @date 2021/2/22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserInfoDto对象", description="解密后的用户敏感数据")
public class UserInfoDto {
    @ApiModelProperty(value = "小程序唯一标识")
    @TableField("openid")
    private String openid;

    @ApiModelProperty(value = "区分小程序、公众号唯一的标识")
    @TableField("unionid")
    private String unionid;

    @ApiModelProperty(value = "会话密钥")
    @TableField("session_key")
    private String session_key;

    @ApiModelProperty(value = "性别编号")
    @TableField("gender")
    private Integer gender;

    @ApiModelProperty(value = "性别")
    @TableField("sex")
    private String sex;

    @ApiModelProperty(value = "头像地址")
    @TableField("avatarUrl")
    private String avatarUrl;

    @ApiModelProperty(value = "用户昵称")
    @TableField("nickName")
    private String nickName;

    @ApiModelProperty(value = "语言")
    @TableField("language")
    private String language;

    @ApiModelProperty(value = "国家")
    @TableField("country")
    private String country;

    @ApiModelProperty(value = "省份")
    @TableField("province")
    private String province;

    @ApiModelProperty(value = "城市")
    @TableField("city")
    private String city;

}
