package org.example.rest.exception;

/**
 * 404:Not Found - 결과값이 없는경우 발생
 */
public class NotFoundException extends RestException {

    private final String code = "not_found";
    private String message = "no resource";

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
