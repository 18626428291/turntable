package com.xujiajun.turntable.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author xjiajun
 * @since 2021-04-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TurnRecord对象", description="")
public class TurnRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "选项id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "选项名")
    private String name;

    @ApiModelProperty(value = "选项描述")
    private String description;

    @ApiModelProperty(value = "选项头像")
    private String avatar;

    @ApiModelProperty(value = "逻辑删除 1（已删除） 0（未删除）")
    private Integer isDeleted;

    @ApiModelProperty(value = "创建时间",example = "2019-01-01 8:00:00")
    @TableField(fill = FieldFill.INSERT) //自动注入 新增
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间", example = "2019-01-01 8:00:00")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;

}
