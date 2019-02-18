package com.appsdevelopblog.app.ws.exceptions;

public class UserServiceException extends RuntimeException {
    private static final long serialVersionUID = -3629927584265995282L;

    public UserServiceException(String message) {
        super(message);
    }
}
