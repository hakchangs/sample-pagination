package org.example.rest.message;

/**
 * Response(dto) 객체로 변환가능한 DAO.
 */
public interface ResponseConvertible {

    Response toResponse();

}
