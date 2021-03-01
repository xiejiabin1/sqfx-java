package com.lzxx.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2021-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("system_user")
@ApiModel(value="User对象", description="用户信息表")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户编号")
    @TableId("user_id")
    private Long userId;

    @ApiModelProperty(value = "用户名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "性别")
    @TableField("sex")
    private String sex;

    @ApiModelProperty(value = "年龄")
    @TableField("age")
    private String age;

    @ApiModelProperty(value = "手机号")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "身份类型编号")
    @TableField("identity_id")
    private Integer identityId;

    @ApiModelProperty(value = "用户类型编号")
    @TableField("user_type_id")
    private Integer userTypeId;

    @ApiModelProperty(value = "证件类型编号")
    @TableField("certificate_id")
    private Integer certificateId;

    @ApiModelProperty(value = "证件号码")
    @TableField("identification_number")
    private String identificationNumber;

    @ApiModelProperty(value = "所在房屋编号")
    @TableField("house_id")
    private Long houseId;

}
