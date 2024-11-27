package com.internally.backend.exceptions;

public class LocationNotFoundException extends RuntimeException {

    public LocationNotFoundException(long id) {
        super("Could not find location " + id);
    }
}
