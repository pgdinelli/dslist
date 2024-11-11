package com.dinellipaulo.dslist.services;

import com.dinellipaulo.dslist.dto.GameMinDTO;
import com.dinellipaulo.dslist.entities.Game;
import com.dinellipaulo.dslist.repositories.GameRepository;
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
