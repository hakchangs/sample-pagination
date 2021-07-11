package org.example.mybatis.runner;

import org.example.mybatis.player.domain.Player;
import org.example.mybatis.player.domain.PlayerQuery;
import org.example.mybatis.player.repository.PlayerRepository;
import org.example.mybatis.player.service.IPlayerService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
public class FetchDataRunner implements ApplicationRunner {

    private final PlayerRepository playerRepository;
    private final IPlayerService playerService;

    public FetchDataRunner(PlayerRepository playerRepository, IPlayerService playerService) {
        this.playerRepository = playerRepository;
        this.playerService = playerService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        int page = 0;
//        int size = 2;
//        Sort sort = Sort.by(Sort.Order.desc("name"), Sort.Order.asc("role"));
//        PlayerQuery query = new PlayerQuery();
//        query.setName("Alves");
//        Page<Player> paged = playerService.getAll(PageRequest.of(page, size, sort), null);
//        System.out.println("paged=");
//        System.out.println(paged);
//        System.out.println(paged.getContent());

//        Sort sort = Sort.by(Sort.Order.desc("name"), Sort.Order.asc("role"));
//        PlayerQuery query = PlayerQuery.builder().name("Alves").build();
//        Page<Player> players = playerService.getAll(PageRequest.of(0, 2, sort), query);
//        System.out.println("players=");
//        System.out.println(players);
//        System.out.println(players.getContent());

    }
}
