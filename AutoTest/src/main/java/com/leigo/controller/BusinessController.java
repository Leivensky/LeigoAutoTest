package com.leigo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController注解中的方法返回的是纯数据：如{"code":200,"message":"OK","data":"abc"}，不是页面图案

@RestController
public class BusinessController {

    @GetMapping("/metric")
    public String getMetric(String name) {
        return "Your name = " + name;
    }

    @PostMapping("/upload")
    public String upload(String file) {
        return "";
    }

}
