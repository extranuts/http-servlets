package com.example.springbootess.repository;

import com.example.springbootess.domain.Anime;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class AnimeRepository {

    public List<Anime> listAll(){
        return List.of(
                new Anime(1,"Унесенные призраками"),
                new Anime(2,"Ходячий замок")
        );
    }
}
