package com.example.demo.exceptions;

import lombok.Getter;

public class EntityNotFoundException extends RuntimeException{

    @Getter
    private ErrorCode errorCode;

    public EntityNotFoundException(String message) {
        super(message);
    }

    // constructeur avec le message et la cause de l'erreur
    public EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    // constructeur avec le message et la cause de l'erreur et le code d'erreur
    public EntityNotFoundException(String message, Throwable cause, ErrorCode errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

}
