package org.example.jpa.player.repository;

import org.example.jpa.player.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PlayerRepository extends JpaRepository<Player, String>, JpaSpecificationExecutor<Player> {

}
