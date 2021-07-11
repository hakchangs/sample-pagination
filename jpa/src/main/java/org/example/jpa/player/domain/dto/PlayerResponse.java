package org.example.jpa.player.domain.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.rest.message.Response;

@NoArgsConstructor
@Getter @Setter @ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PlayerResponse extends Response {

    String name;

}
