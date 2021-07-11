package org.example.jpa.player.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.jpa.player.domain.dto.PlayerMapper;
import org.example.rest.message.Response;
import org.example.rest.message.ResponseConvertible;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor @Builder
@Setter @Getter @ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Player implements ResponseConvertible {

    @Id
    String name;
    String role;

    @Override
    public Response toResponse() {
        return PlayerMapper.INSTANCE.toResponse(this);
    }
}
