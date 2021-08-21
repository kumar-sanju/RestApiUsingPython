package com.example.pythonrestapi;

public class signup_response_model {

    String code;
    String error;

    public signup_response_model(String code, String error) {
        this.code = code;
        this.error = error;
    }

    public signup_response_model() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
