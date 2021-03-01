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
 * 房屋信息表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2021-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("system_house")
@ApiModel(value="House对象", description="房屋信息表")
public class House implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "房屋编号")
    @TableId("house_id")
    private Long houseId;

    @ApiModelProperty(value = "社区编号")
    @TableField("community_id")
    private String communityId;

    @ApiModelProperty(value = "楼号")
    @TableField("buildingNumber")
    private String buildingNumber;

    @ApiModelProperty(value = "单元号")
    @TableField("unitNumber")
    private String unitNumber;

    @ApiModelProperty(value = "房间号")
    @TableField("roomNumber")
    private String roomNumber;


}
