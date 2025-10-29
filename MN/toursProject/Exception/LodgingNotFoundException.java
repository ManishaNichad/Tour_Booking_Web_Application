package com.MN.toursProject.Exception;

public class LodgingNotFoundException extends RuntimeException {
    public LodgingNotFoundException(String message) {
        super(message);
    }
}