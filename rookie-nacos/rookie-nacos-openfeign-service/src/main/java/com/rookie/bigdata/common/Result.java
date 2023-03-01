package com.rookie.bigdata.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname Result
 * @Description
 * @Author rookie
 * @Date 2023/3/1 17:33
 * @Version 1.0
 */
@Data
public class Result implements Serializable {

    private int code; // 200是正常，非200表示异常
    private String msg;
    //成功或者失败
    //SUCCESS/ERROR
    // private String Result;
    private Object data;

    public static Result succ() {
        return succ(200, "操作成功", null);
    }

    public static Result succ(Object data) {
        return succ(200, "操作成功", data);
    }

    public static Result succ(int code, String msg) {
        return succ(code, msg, null);
    }

    public static Result succ(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(String msg) {
        return fail(400, msg, null);
    }

    public static Result fail(int code, String msg) {
        return fail(code, msg, null);
    }

//    public static Result fail(ErrorInfoEnum errorInfoEnum) {
//        return fail(errorInfoEnum.getCode(), errorInfoEnum.getMessage(), null);
//    }
//
//    public static Result fail(ErrorInfoEnum errorInfoEnum, String msg) {
//
//        String Message = String.format(errorInfoEnum.getMessage(), msg);
//
//        return fail(errorInfoEnum.getCode(), Message, null);
//    }
//
//
//    public static Result fail(ErrorInfoEnum errorInfoEnum, Object data) {
//        return fail(errorInfoEnum.getCode(), errorInfoEnum.getMessage(), data);
//    }

    public static Result fail(String msg, Object data) {
        return fail(400, msg, data);
    }

    public static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

}