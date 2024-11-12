package com.cbfproject.student_data_system.exception;

import org.springframework.http.HttpStatus;

public class StudentException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

//    constructor
    public StudentException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

//getters
    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
