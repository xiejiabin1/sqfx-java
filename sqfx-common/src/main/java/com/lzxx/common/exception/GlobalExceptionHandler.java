package com.lzxx.common.exception;


import com.lzxx.common.result.ResultJSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 先谢郭嘉
 * @version 1.0
 * @description: 全局异常处理
 * @date 2021/2/22
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 处理业务异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultJSON<String> bizExceptionHandler(HttpServletRequest request, Exception e){
        log.error("发生业务异常！原因是：{}",e.getMessage());
        return ResultJSON.error(e.getMessage());
    }
}
