package com.dinellipaulo.gamesrank.repositories;

import com.dinellipaulo.gamesrank.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
