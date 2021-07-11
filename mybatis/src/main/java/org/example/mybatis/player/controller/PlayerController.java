package org.example.mybatis.player.controller;

import org.example.mybatis.player.domain.PlayerQuery;
import org.example.mybatis.player.domain.Player;
import org.example.mybatis.player.service.PlayerService;
import org.example.rest.exception.NotFoundException;
import org.example.rest.message.PageResponseGenerator;
import org.example.rest.message.RestResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public RestResponse<?> search(@RequestParam int page, @RequestParam int size, Sort sort, PlayerQuery query) {
        Page<Player> result = playerService.getAll(PageRequest.of(page, size, sort), query);
        return RestResponse.builder()
                .code("success")
                .result(PageResponseGenerator.generate(result))
                .build();
    }

    @GetMapping("/{name}")
    public RestResponse<?> get(@PathVariable String name) {
        Player result = playerService.getByName(name).orElseThrow(() -> new NotFoundException());
        return RestResponse.builder()
                .code("success")
                .result(result.toResponse())
                .build();
    }

}
