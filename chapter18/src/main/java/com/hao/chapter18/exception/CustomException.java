package com.hao.chapter18.exception;

import java.io.Serializable;

/**
 * 自定义异常
 *
 * @author haohj
 * @date 2020-06-04 09:35
 */
public class CustomException extends RuntimeException {
    private static final long serialVersionUID = 4564124491192825748L;

    private int code;

    public CustomException() {
        super();
    }

    public CustomException(int code, String message) {
        super(message);
        this.setCode(code);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
