package com.xujiajun.turntable.common.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * 常用状态码
 * Created by xujiajun on 2021/4/1
 */
@Getter
@AllArgsConstructor
public enum ResultCode implements Serializable {

    SUCCESS(200, "操作成功"),
    ERROR(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");

    private static final long serialVersionUID = -1L;

    private Integer code;
    private String message;
}
