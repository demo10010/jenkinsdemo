package com.haizhi.jenkinsdemo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "描述")
@RequestMapping("/test")
public class TestController {

    @GetMapping("/echo")
    public String getEchoString(@PathVariable(name = "param")  String param){
        return "you input String is : "+param;
    }
}
