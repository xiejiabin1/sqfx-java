package com.lzxx.common.exception;

import com.lzxx.common.result.ResultCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 自定义异常
 * @date 2021/2/22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyException extends RuntimeException{
    /**
     * 异常枚举类
     */
    private ResultCodeEnum codeEnum;

    /**
     * 解决方案
     */
    private String resolvent;

    public MyException(ResultCodeEnum codeEnum2){
        codeEnum = codeEnum2;
    }
}
