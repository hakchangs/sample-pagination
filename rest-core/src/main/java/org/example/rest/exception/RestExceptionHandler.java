package org.example.rest.exception;

import org.example.rest.message.RestErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    //
    //2XX - Request Success. but, something strange.
    //
    @ExceptionHandler(NoContentException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public RestErrorResponse notFound(NoContentException error) {
        return generateResponse(error);
    }

    //
    //4XX - Request Error
    //
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public RestErrorResponse notFound(NotFoundException error) {
        return generateResponse(error);
    }

    @ExceptionHandler(AlreadyExistException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RestErrorResponse alreadyExist(AlreadyExistException error) {
        return generateResponse(error);
    }

    @ExceptionHandler(LockedException.class)
    @ResponseStatus(code = HttpStatus.LOCKED)
    public RestErrorResponse locked(LockedException error) {
        return generateResponse(error);
    }

    //
    //5XX - Server Error
    //

    /**
     * generate RestErrorResponse
     * @param error
     * @return
     */
    private RestErrorResponse generateResponse(RestException error) {
        return RestErrorResponse.builder()
                .code(error.getCode())
                .message(error.getMessage())
                .build();
    }

}
