package com.xujiajun.turntable.entity.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * Created by xujiajun on 2021/4/7
 */
@ApiModel(value = "选项表单对象", description = "选项表单对象")
@Data
public class TurnRecordVo {
    private static final long serialVersionID = 1L;
    private Long id;
    private String name;
    private String description;
    private String avater;


}
