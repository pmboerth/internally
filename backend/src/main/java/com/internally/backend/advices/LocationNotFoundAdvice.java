package com.internally.backend.advices;

import com.internally.backend.exceptions.LocationNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LocationNotFoundAdvice {

    @ExceptionHandler(LocationNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String locationNotFoundHandler(LocationNotFoundException ex) {
        return ex.getMessage();
    }
}
