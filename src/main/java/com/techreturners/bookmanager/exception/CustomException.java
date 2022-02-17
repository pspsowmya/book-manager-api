package com.techreturners.bookmanager.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class CustomException {
    private ZonedDateTime timeStamp;
    private String message;
    private Throwable throwable;
    private HttpStatus HttpStatus;



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
