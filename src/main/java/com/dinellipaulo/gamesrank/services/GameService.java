package com.dinellipaulo.gamesrank.services;

import com.dinellipaulo.gamesrank.dto.GameMinDTO;
import com.dinellipaulo.gamesrank.entities.Game;
import com.dinellipaulo.gamesrank.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
