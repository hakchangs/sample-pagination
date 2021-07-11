package org.example.rest.exception;

/**
 * 204:No Content - 요청은 정상이나 처리할 리소스가 없는 경우.
 */
public class NoContentException extends RestException {

    private final String code = "no_content";
    private String message = "there is not content";

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
