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
 * 证件类型表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2021-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("system_certificate")
@ApiModel(value="Certificate对象", description="证件类型表")
public class Certificate implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "证件类型编号")
    @TableId(value = "certificate_id", type = IdType.AUTO)
    private Integer certificateId;

    @ApiModelProperty(value = "证件类型名词")
    @TableField("certificate_name")
    private String certificateName;

    @ApiModelProperty(value = "用户类型编号")
    @TableField("user_type_id")
    private Integer userTypeId;


}
