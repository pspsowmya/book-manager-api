package com.techreturners.bookmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class BookExceptionHandler {

    // If more exceptions are being handled here they can be appended to "value = ..."
    @ExceptionHandler(value = {GetEmptyException.class})
    public ResponseEntity<Object> handleGetEmptyException(GetEmptyException e) {
        CustomException getException = new CustomException(
                ZonedDateTime.now(),
                e,
                HttpStatus.NOT_FOUND,
                e.getMessage()
        );

        return new ResponseEntity<>(getException, HttpStatus.NOT_FOUND);
    }

}
