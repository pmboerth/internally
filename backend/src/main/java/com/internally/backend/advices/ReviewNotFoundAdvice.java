package com.internally.backend.advices;

import com.internally.backend.exceptions.ReviewNotFoundException;
import com.internally.backend.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ReviewNotFoundAdvice {

    @ExceptionHandler(ReviewNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String reviewNotFoundHandler(ReviewNotFoundException ex) {
        return ex.getMessage();
    }
}
