package com.example.springbootess.controller;


import com.example.springbootess.util.PureTX;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Data
@RestController
@ConfigurationProperties(prefix = "word-config")
public class LuckyWord {

    String luckyWord;
    String preamble;

    @PureTX
    @RequestMapping("/luckyword")
    public String showLuckyWord(){
        return preamble + " " + luckyWord;

    }
}
