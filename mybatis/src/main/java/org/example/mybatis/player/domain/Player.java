package org.example.mybatis.player.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.mybatis.player.domain.dto.PlayerMapper;
import org.example.mybatis.player.domain.dto.PlayerResponse;
import org.example.rest.message.ResponseConvertible;

@NoArgsConstructor
@Getter @Setter @ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Player implements ResponseConvertible {

    String name;
    String role;

    @Override
    public PlayerResponse toResponse() {
        return PlayerMapper.INSTANCE.toResponse(this);
    }
}
