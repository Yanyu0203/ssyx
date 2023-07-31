package org.yyy.ssyx.common.result;

import lombok.Data;

@Data
public class Result<T> {

    //Code
    private Integer code;

    //Info
    private String message;

    //Data
    private T data;

    private Result() { }

    public static<T> Result<T> build(T data, Integer code, String message) {
        Result<T> result = new Result<>();
        if(data != null) {
            result.setData(data);
        }
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    //Set Data
    public static<T> Result<T> build(T data, ResultCodeEnum resultCodeEnum) {
        Result<T> result = new Result<>();
        if(data != null) {
            result.setData(data);
        }
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }

    //Success
    public static<T> Result<T> ok(T data) {
        return build(data, ResultCodeEnum.SUCCESS);
    }

    //Fail
    public static<T> Result<T> fail(T data) {
        return build(data, ResultCodeEnum.FAIL);
    }

}
