package com.dinellipaulo.dslist.services;

import com.dinellipaulo.dslist.dto.GameDTO;
import com.dinellipaulo.dslist.dto.GameMinDTO;
import com.dinellipaulo.dslist.entities.Game;
import com.dinellipaulo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true) //Transactions ACID annotation
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        //could implement exception handler to verify if id already exists
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
