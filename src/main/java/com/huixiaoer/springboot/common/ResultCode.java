package com.huixiaoer.springboot.common;

public enum ResultCode {
    SUCCESS(200, "请求成功！"),//成功
    FAIL(400, "请求失败！"),//失败
    VALIDATIONfAIL(401, "数据校验失败！"),//未认证（签名错误）
    UNAUTHORIZED(402, "认证失败！"),//未认证（签名错误）
    NOT_FOUND(404, "接口不存在！"),//接口不存在
    INTERNAL_SERVER_ERROR(500, "服务器内部错误！");//服务器内部错误

    public int code;
    public String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
