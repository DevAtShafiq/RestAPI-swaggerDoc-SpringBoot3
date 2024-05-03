package com.example.aroundstudiohub.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
