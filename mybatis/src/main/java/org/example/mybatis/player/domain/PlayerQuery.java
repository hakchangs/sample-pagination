package org.example.mybatis.player.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter @ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PlayerQuery {

    String name;

}
