package com.xujiajun.turntable.common.api;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一返回结果类
 * Created by xujiajun on 2021/4/1
 */
@Data
public class R {
    /**
     * 是否成功
     */
    private Boolean success;
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 封装数据
     */
    private Map<String, Object> data = new HashMap<>();

    private R() {
    }

    /**
     * 成功静态方法
     *
     * @return
     */
    public static R ok() {
        R r = new R();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS.getCode());
        r.setMessage(ResultCode.SUCCESS.getMessage());
        return r;
    }

    /**
     * 失败静态方法
     *
     * @return
     */
    public static R error() {
        R r = new R();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR.getCode());
        r.setMessage(ResultCode.ERROR.getMessage());
        return r;
    }

    public R success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    public R message(String success) {
        this.setMessage(success);
        return this;
    }

    public R code(Integer code) {
        this.setCode(code);
        return this;
    }

    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public R data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
}