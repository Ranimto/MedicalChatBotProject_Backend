package com.example.demo.exceptions;

public enum ErrorCode {

    UTILISATEUR_NOT_FOUND(12000),
    UTILISATEUR_NOT_VALID(12001),
    UTILISATEUR_ALREADY_EXISTS(12002),
    UTILISATEUR_CHANGE_PASSWORD_OBJECT_NOT_VALID(12003);

    private int code;

    ErrorCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
