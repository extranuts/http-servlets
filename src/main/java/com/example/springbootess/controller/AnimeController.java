package com.example.springbootess.controller;


import com.example.springbootess.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {

    @GetMapping(path = "/list")
    public List<Anime> listAll(){
        return Arrays.asList(new Anime("AAA"), new Anime("BBB"));
    }

}
