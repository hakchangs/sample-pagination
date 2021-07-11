package org.example.mybatis.player.service;

import org.example.mybatis.player.domain.Player;
import org.example.mybatis.player.domain.PlayerQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IPlayerService {

    Iterable<Player> getAll();
    Page<Player> getAll(Pageable pageable, PlayerQuery query);

    Optional<Player> getByName(String name);

}
