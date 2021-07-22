package com.example.springbootess.util;

import com.example.springbootess.domain.Anime;
import com.example.springbootess.exception.ResourceNotFoundException;
import com.example.springbootess.repository.AnimeRepository;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Component
public class Util {

    public String formatLocalDateTimeToDataBaseStyle(LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime);
    }
    public Anime findAnimeOrThrowNotFound(int id, AnimeRepository animeRepository){

    return animeRepository
            .findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Anime is not FOUND"));

    }
}
