package com.dinellipaulo.dslist.dto;

import com.dinellipaulo.dslist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(){}

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
        //could use BeanUtils.copyProperties for this constructor
    }
    //don't need to implement set methods for this DTO since BeanUtils.copyProperties is not being used
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
