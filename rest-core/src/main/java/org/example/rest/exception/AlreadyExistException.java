package org.example.rest.exception;

/**
 * 404 - 리소스가 없는경우
 */
public class AlreadyExistException extends RestException {

    private final String code = "already_exist";
    private String message = "request resource is already exists";

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
