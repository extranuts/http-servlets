package com.example.springbootess.client;


import com.example.springbootess.domain.Anime;
import com.example.springbootess.wrapper.PageableResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class SpringClient {

    public static void main(String[] args) {

        ResponseEntity<Anime> animeResponseEntity = new RestTemplate()
                .getForEntity("http://localhost:8080/anime/{id}", Anime.class,2);
        log.info("response entity {}", animeResponseEntity);

        log.info("Resp data {}", animeResponseEntity.getBody());

        Anime anime = new RestTemplate()
                .getForObject("http://localhost:8080/anime/{id}",Anime.class,2);
        log.info("Anime {}", anime);

        Anime[] animeArray = new RestTemplate()
                .getForObject("http://localhost:8080/anime",Anime[].class);
        log.info("Anime array {}",Arrays.toString(animeArray));

        var exchangeAnimeList = new RestTemplate()
                .exchange(
                        "http://localhost:8080/anime?sort=name,desc",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<PageableResponse<Anime>>() {
                        });

        log.info("Anime array {}",exchangeAnimeList.getBody());


    }
}
