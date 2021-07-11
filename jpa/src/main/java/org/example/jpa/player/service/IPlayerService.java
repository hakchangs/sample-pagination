package org.example.jpa.player.service;

import org.example.jpa.player.domain.Player;
import org.example.jpa.player.domain.PlayerQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IPlayerService {

    Iterable<Player> getAll();
    Page<Player> getAll(Pageable pageable, PlayerQuery query);

    Optional<Player> getByName(String name);

}
