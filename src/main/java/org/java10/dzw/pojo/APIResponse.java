package org.java10.dzw.pojo;

import java.io.Serializable;

public class APIResponse implements Serializable {

    private Integer code;
    private Object data;
    private String message;

    public APIResponse(Integer code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;

    }
    public APIResponse() {


    }

    public Integer getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
