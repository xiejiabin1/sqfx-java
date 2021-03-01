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
 * 身份信息表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2021-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("system_identity")
@ApiModel(value="Identity对象", description="身份信息表")
public class Identity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "身份类型编号")
    @TableId(value = "identity_id", type = IdType.AUTO)
    private Integer identityId;

    @ApiModelProperty(value = "身份名称")
    @TableField("identity_name")
    private String identityName;


}
