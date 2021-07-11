package org.example.mybatis.player.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.mybatis.mybatis.mapper.PaginationMapper;
import org.example.mybatis.player.domain.Player;
import org.example.mybatis.player.domain.PlayerQuery;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PlayerMapper extends PaginationMapper<Player, PlayerQuery> {

    @Select("SELECT COUNT(*) FROM player")
    long count();

    @Select("SELECT * FROM player")
    List<Player> findAll();

    @Select("<script>" +
            "SELECT * " +
            "FROM player " +
            "WHERE 1=1" +
            "<if test='q != null'>" +
            "   <if test='q.name != null'>" +
            "   AND name = #{q.name}" +
            "   </if>" +
            "</if>" +
            //
            //PAGING AREA - START
            //
            //1.Sorting 정의
            "ORDER BY " +
            "<foreach item='order' collection='p.sort.orders' separator=','>" +
            "   <if test='order.getProperty() == \"name\"'>name</if>" +
            "   <if test='order.getProperty() == \"role\"'>role</if>" +
            "   <choose>" +
            "       <when test='order.getDirection().isDescending()'> DESC</when>" +
            "       <otherwise> ASC</otherwise>" +
            "   </choose>" +
            "</foreach>" +
            //2.Paging 건수처리
            "LIMIT #{p.size} OFFSET #{p.offset}" +
            //
            //PAGING AREA - END
            //
            "</script>")
    @Override
    List<Player> findList(Pageable p, PlayerQuery q);

    @Select("<script>" +
            "SELECT * " +
            "FROM player " +
            "WHERE name = #{name}" +
            "</script>")
    Optional<Player> findByName(String name);

}
