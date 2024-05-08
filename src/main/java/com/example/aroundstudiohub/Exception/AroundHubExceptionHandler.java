package com.example.aroundstudiohub.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class AroundHubExceptionHandler {
    private final Logger logger = LoggerFactory.getLogger(AroundHubExceptionHandler.class);

    @ExceptionHandler(value=Exception.class)
    public ResponseEntity<Map<String,String >> ExceptionHandler(Exception e){

        HttpHeaders responseHeaders = new HttpHeaders();
        HttpStatus httpStatus =HttpStatus.BAD_REQUEST;
        logger.info(e.getMessage());
        logger.info("Advice Exception print");

        Map<String,String>map = new HashMap<>();
        map.put("error type", httpStatus.getReasonPhrase());
        map.put("code", "400");
        map.put("message", "error print");
        return new ResponseEntity<>(map,responseHeaders,httpStatus);
    }

}
