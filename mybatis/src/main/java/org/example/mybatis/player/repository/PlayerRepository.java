package org.example.mybatis.player.repository;

import org.example.mybatis.player.domain.Player;
import org.example.mybatis.player.domain.PlayerQuery;
import org.example.mybatis.player.mapper.PlayerMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PlayerRepository implements CrudRepository<Player, String> {

    private final PlayerMapper playerMapper;

    public PlayerRepository(PlayerMapper playerMapper) {
        this.playerMapper = playerMapper;
    }

    @Override
    public <S extends Player> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Player> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Player> findById(String name) {
//        return Optional.empty();
        return playerMapper.findByName(name);
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<Player> findAll() {
        return playerMapper.findAll();
    }

    public Page<Player> findAll(Pageable pageable, PlayerQuery query) {
        List<Player> list = playerMapper.findList(pageable, query);
        return new PageImpl<>(list, pageable, count());
    }

    @Override
    public Iterable<Player> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return playerMapper.count();
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Player entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Player> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
