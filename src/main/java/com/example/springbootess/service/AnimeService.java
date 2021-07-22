package com.example.springbootess.service;


import com.example.springbootess.domain.Anime;
import com.example.springbootess.repository.AnimeRepository;
import com.example.springbootess.util.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@RequiredArgsConstructor
public class AnimeService {

    private final Util utils;
    private final AnimeRepository animeRepository;

    public List<Anime> listAll(){
        return animeRepository.findAll();
    }

    public Anime findById(int id){
        return utils.findAnimeOrThrowNotFound(id, animeRepository);
    }

    public Anime save(Anime anime) {
        return animeRepository.save(anime);
    }

    public void delete(int id){
        animeRepository.delete(utils.findAnimeOrThrowNotFound(id, animeRepository));
    }

    public void update(Anime anime){
        animeRepository.save(anime);
    }
}
