package com.leigo.model;

import lombok.Data;

@Data
public class ResponseResult {

    private int code;
    private String message;
    private String data;

    public ResponseResult(int code, String message, String data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
