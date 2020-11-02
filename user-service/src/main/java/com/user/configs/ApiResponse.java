package com.user.configs;

import org.springframework.stereotype.Component;


public class ApiResponse {
    public ApiResponse(Boolean status, String message, Object data){
        this.status = status;
        this.message = message;
        this.data = data;
    }
    Boolean status = false;
    String message = "";
    Object data = "";

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
