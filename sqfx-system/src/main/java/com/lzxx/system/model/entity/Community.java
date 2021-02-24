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
 * 社区表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2021-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("system_community")
@ApiModel(value="Community对象", description="社区表")
public class Community implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "社区编号")
    @TableId("community_id")
    private String communityId;

    @ApiModelProperty(value = "社区名词")
    @TableField("community_name")
    private String communityName;

    @ApiModelProperty(value = "省份")
    @TableField("province")
    private String province;

    @ApiModelProperty(value = "城市")
    @TableField("city")
    private String city;


}
