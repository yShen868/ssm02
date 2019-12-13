package com.yShen.study.controller;


import org.springframework.stereotype.Repository;


public class GsonResult {
    private Integer Code;
    private String msg;

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public GsonResult(Integer code, String msg) {
        Code = code;
        this.msg = msg;
    }

    public GsonResult() {
    }
}
