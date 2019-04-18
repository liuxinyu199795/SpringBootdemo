package com.lxy.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/*
    用于捕获全局异常的类
 */
/*@ControllerAdvice//声明控制器切面
public class GlobalExcepitonHandle {
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)//用于捕获运行时异常
    public Map<String,Object> exceptionHandle(){
        Map<String,Object> map = new HashMap<>();
        map.put("errorCode","101");
        map.put("errorMsg","系统错误");
        return map;
    }
}*/
