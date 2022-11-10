package com.example.elasticsearch.web.interceptor;

import com.example.elasticsearch.web.exception.NotContainsStrException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author gengaoliu
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionInterceptor {
  @ExceptionHandler({NotContainsStrException.class, Exception.class})
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public Object exceptionHandle(Exception exception) {
    log.warn(exception.getMessage(), exception);
    return exception.getMessage();
  }
}
