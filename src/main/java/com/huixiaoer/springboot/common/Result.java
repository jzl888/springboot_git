package com.huixiaoer.springboot.common;

public class Result {
    private int code;
    private String message;
    private Object data;
    private String document;
    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        this.message = resultCode.message;
        return this;
    }

    public int getCode() {
        return code;
    }

    public Result setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    public String getDocument() {
        return document;
    }

    public Result setDocument(String document) {
        this.document = document;
        return this;
    }
}
