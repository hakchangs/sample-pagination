package org.example.mybatis.player.domain.dto;

import org.example.mybatis.player.domain.Player;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlayerMapper {

    PlayerMapper INSTANCE = Mappers.getMapper(PlayerMapper.class);

    PlayerResponse toResponse(Player player);

}
