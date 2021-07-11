package org.example.rest.exception;

/**
 * 423:Locked. 요청한 리소스가 작업중인 경우 발생.
 */
public class LockedException extends RestException {

    private final String code = "locked";
    private String message = "request process is not available";

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
