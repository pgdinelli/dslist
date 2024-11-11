package com.dinellipaulo.dslist.repositories;

import com.dinellipaulo.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
