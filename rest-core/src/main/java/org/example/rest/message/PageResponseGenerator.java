package org.example.rest.message;

import org.springframework.data.domain.Page;

import java.util.stream.Collectors;

/**
 * Rest 응답에 사용할 PageResponse 객체를 생성해준다.
 */
public class PageResponseGenerator {

    public static PageResponse<Response> generate(Page<? extends ResponseConvertible> page) {

        return PageResponse.<Response> builder()
                .number(page.getNumber())
                .size(page.getSize())
                .totalPages(page.getTotalPages())
                .totalElements(page.getTotalElements())
                .numberOfElements(page.getNumberOfElements())
                .first(page.isFirst())
                .last(page.isLast())
                .empty(page.isEmpty())
                .content(page.getContent().stream().map(item -> item.toResponse()).collect(Collectors.toList()))
                .build();
    }

}
