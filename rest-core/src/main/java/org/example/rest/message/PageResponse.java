package org.example.rest.message;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * 페이지네이션을 위한 Rest 응답 VO
 * @param <Response> 조회결과(DAO). 리스트 형태로 저장된다.
 */
@AllArgsConstructor
@Builder
@Getter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PageResponse<Response> {

    int number;
    int size;

    int totalPages;
    long totalElements;
    int numberOfElements;

    boolean first;
    boolean last;
    boolean empty;

    List<Response> content;

}
