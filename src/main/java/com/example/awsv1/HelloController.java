package com.example.awsv1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/aws/v1")
    public String hello(@RequestParam(defaultValue = "1") Integer number){
        if(number == 1){
            log.info("/aws/v1 이 호출 info 로그 #####################################");
        }else if(number == -1){
            log.error("/aws/v1 이 호출 error 로그 #####################################");
        }else if(number == 0){
            log.warn("/aws/v1 이 호출 warn 로그 #####################################");
        }

        return "<h1>aws v1</h1>";
    }
}