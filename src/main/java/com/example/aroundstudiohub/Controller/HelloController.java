package com.example.aroundstudiohub.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Executable;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1")
public class HelloController {



    final Logger logger= LoggerFactory.getLogger(HelloController.class);

    @PostMapping("/log-test")
    public void logTest(){
        logger.info("Info log");
        logger.warn("warn log");
        logger.error("error log");
        logger.trace("trace log");
        logger.debug("debug log");

    }


    @PostMapping("/exception")

public void exceptionTest() throws Exception{

        throw new Exception();
    }


    @ExceptionHandler(value=Exception.class)
    public ResponseEntity<Map<String,String >> ExceptionHandler(Exception e){

        HttpHeaders responseHeaders = new HttpHeaders();
        HttpStatus httpStatus =HttpStatus.BAD_REQUEST;

       logger.info("Controller Exception print");

       Map<String,String>map = new HashMap<>();
       map.put("error type", httpStatus.getReasonPhrase());
       map.put("code", "400");
       map.put("message", "error print");
        return new ResponseEntity<>(map,responseHeaders,httpStatus);
    }

}
