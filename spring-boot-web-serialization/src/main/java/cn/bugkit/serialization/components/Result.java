package cn.bugkit.serialization.components;

import java.security.InvalidParameterException;

/**
 * @author bugkit
 * @since 2022.2.25
 */
public enum Result {

    SUCCESS(0,"SUCCESS"),
    FAIL(-1,"FAIL");

    int code;
    String msg;

    Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static Result valueOf(int code){
        Result[] values = values();
        for (Result result : values) {
            if (result.getCode() == code) {
                return result;
            }
        }
        throw new InvalidParameterException("Invalid Code");
    }
}
