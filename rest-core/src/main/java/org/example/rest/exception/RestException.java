package org.example.rest.exception;

public abstract class RestException extends RuntimeException {

    public abstract String getCode();
    public abstract String getMessage();

}
