package com.huixiaoer.springboot.common;

public class ResultGenerator {

    public static Result genSuccessResult(StringBuffer url) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setDocument(url.toString());
    }

    public static Result genSuccessResult(StringBuffer url, Object data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setDocument(url.toString())
                .setData(data);
    }

    public static Result genFailResult(StringBuffer url, String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setDocument(url.toString())
                .setMessage(message);
    }

    public static Result genValidationFailResult(StringBuffer url, Object data) {
        return new Result()
                .setCode(ResultCode.VALIDATIONfAIL)
                .setDocument(url.toString())
                .setData(data);
    }
}

