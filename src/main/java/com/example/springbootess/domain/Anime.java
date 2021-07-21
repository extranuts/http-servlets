package com.example.springbootess.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
public class Anime {

    private Integer id;
    private String name;

}