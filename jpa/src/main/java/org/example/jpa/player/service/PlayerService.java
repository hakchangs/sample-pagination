package org.example.jpa.player.service;

import org.example.jpa.player.domain.Player;
import org.example.jpa.player.domain.PlayerQuery;
import org.example.jpa.player.domain.PlayerSpec;
import org.example.jpa.player.repository.PlayerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
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
        Specification<Player> spec = Specification.where(PlayerSpec.name(query.getName()));
        return playerRepository.findAll(spec, pageable);
    }

    @Override
    public Optional<Player> getByName(String name) {
        return playerRepository.findById(name);
    }
}
