package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Api(value = "接口Controller",description = "Hello接口的描述文字")
public class HelloController {
    @ApiOperation(value = "方法hi",notes = "方法的详细说明")
    @RequestMapping("/hi")
    public String hi(String name){
        return  "hello:"+name;
    }
}
