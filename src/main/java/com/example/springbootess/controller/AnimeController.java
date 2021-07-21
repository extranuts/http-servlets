package com.example.springbootess.controller;


import com.example.springbootess.domain.Anime;
import com.example.springbootess.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("anime")
@Slf4j
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;

    @GetMapping(path = "/list")
    public List<Anime> listAll() {
        log.info("Date Formatted {}",
                dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));

        return Arrays.asList(
                new Anime("Унесенные призраками"),
                new Anime("Ходячий замок")
        );
    }

}
