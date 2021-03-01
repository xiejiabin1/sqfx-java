package com.lzxx.system.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户类型表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2021-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("system_user_type")
@ApiModel(value="UserType对象", description="用户类型表")
public class UserType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户类型编号")
    @TableId(value = "user_type_id", type = IdType.AUTO)
    private Integer userTypeId;

    @ApiModelProperty(value = "类型名词")
    @TableField("name")
    private String name;


}
