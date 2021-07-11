package org.example.mybatis.player.service;

import org.example.mybatis.player.domain.Player;
import org.example.mybatis.player.domain.PlayerQuery;
import org.example.mybatis.player.repository.PlayerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService implements IPlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Iterable<Player> getAll() {
        return playerRepository.findAll();
    }

    @Override
    public Page<Player> getAll(Pageable pageable, PlayerQuery query) {
        return playerRepository.findAll(pageable, query);
    }

    @Override
    public Optional<Player> getByName(String name) {
        return playerRepository.findById(name);
    }

}
