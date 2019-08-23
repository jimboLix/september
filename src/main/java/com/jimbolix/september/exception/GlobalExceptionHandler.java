package com.jimbolix.september.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest request,Exception e){
        ErrorInfo<String> errorInfo = new ErrorInfo<>();
        errorInfo.setCode(ErrorInfo.ERROR);
        errorInfo.setMessage(e.getMessage());
        errorInfo.setData(e.toString());
        errorInfo.setUrl(request.getRequestURL().toString());
        return errorInfo;
    }
}
