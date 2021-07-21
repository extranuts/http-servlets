package com.example.springbootess.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class Anime {

    private String name;

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
