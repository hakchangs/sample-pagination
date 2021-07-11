package org.example.jpa.runner;

import org.example.jpa.player.domain.Player;
import org.example.jpa.player.repository.PlayerRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchDataRunner implements ApplicationRunner {

    private final PlayerRepository playerRepository;

    public FetchDataRunner(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        List<Player> players = playerRepository.findAll();
//        System.out.println("players=");
//        System.out.println(players);

//        int page = 0;
//        int size = 2;
//        Sort sort = Sort.by(Sort.Order.desc("name"));
//        Page<Player> players = playerRepository.findAll(PageRequest.of(page, size, sort));
//        System.out.println("players=");
//        System.out.println(players);

    }
}
