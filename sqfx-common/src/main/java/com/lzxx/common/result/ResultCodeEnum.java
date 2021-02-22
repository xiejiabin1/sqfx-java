package com.lzxx.common.result;

import lombok.Getter;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 返回状态枚举类
 * @date 2021/2/22
 */
@Getter
public enum  ResultCodeEnum {
    SUCCESS(true, "0", "成功"),
    FAIL(false, "1", "失败"),
    ERROR(false, "-1", "系统异常"),

    FAIL_DECODE(false,"101","解密失败");

    /**
     * 是否成功
     */
    private Boolean flag;
    /**
     * 状态码
     */
    private String code;
    /**
     * 返回信息
     */
    private String message;

    ResultCodeEnum(Boolean flag, String code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

}
