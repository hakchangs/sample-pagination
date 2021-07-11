package org.example.jpa.player.domain.dto;

import javax.annotation.Generated;
import org.example.jpa.player.domain.Player;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-11T15:13:15+0900",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_25 (Oracle Corporation)"
)
public class PlayerMapperImpl implements PlayerMapper {

    @Override
    public PlayerResponse toResponse(Player player) {
        if ( player == null ) {
            return null;
        }

        PlayerResponse playerResponse = new PlayerResponse();

        playerResponse.setName( player.getName() );

        return playerResponse;
    }
}
