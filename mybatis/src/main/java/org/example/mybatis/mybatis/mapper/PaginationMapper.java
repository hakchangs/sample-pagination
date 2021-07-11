package org.example.mybatis.mybatis.mapper;

import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PaginationMapper<T, Q> {

    List<T> findList(Pageable p, Q q);

}
