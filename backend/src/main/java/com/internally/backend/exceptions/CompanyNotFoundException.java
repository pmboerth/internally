package com.internally.backend.exceptions;

public class CompanyNotFoundException extends RuntimeException {

    public CompanyNotFoundException(long id) {
        super("Could not find company " + id);
    }
}
