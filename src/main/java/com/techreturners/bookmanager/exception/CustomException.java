package com.techreturners.bookmanager.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class CustomException {
    private ZonedDateTime timeStamp;
    private Throwable throwable;
    private HttpStatus HttpStatus;
    private String message;

    public CustomException(ZonedDateTime timeStamp, Throwable throwable,
                           org.springframework.http.HttpStatus httpStatus, String message) {
        this.timeStamp = timeStamp;
        this.throwable = throwable;
        HttpStatus = httpStatus;
        this.message = message;
    }

    public ZonedDateTime getTimeStamp() {
        return timeStamp;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public org.springframework.http.HttpStatus getHttpStatus() {
        return HttpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
