package com.zhoulei.ad.advice;

import com.zhoulei.ad.exception.AdException;
import com.zhoulei.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest req, AdException ex){
        CommonResponse response = new CommonResponse(-1,"bussiness error");
        response.setData(ex.getMessage());
        return response;
    }
}

