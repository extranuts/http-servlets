package com.example.springbootess.repository;

import com.example.springbootess.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Repository
public class AnimeRepository {

    private static List<Anime> animes;
    static {
        animes = new ArrayList<>(List.of(
                new Anime(1,"Унесенные призраками"),
                new Anime(2,"Ходячий замок")
        ));

    }
    public List<Anime> listAll(){
        return animes;
    }
    public Anime save(Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextInt(4,100000));
        animes.add(anime);
        return anime;
    }
    public void delete(int id){
        animes.remove(animes
                .stream()
                .filter(anime -> anime.getId() == id)
                .findFirst()
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Anime not found")));
    }
}
