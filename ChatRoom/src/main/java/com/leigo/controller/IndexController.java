package com.leigo.controller;

import com.leigo.model.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/register")
    public ResponseResult register() {
        String token = "sxxxsadas";

        return new ResponseResult(200, "OK", token);
    }

}
