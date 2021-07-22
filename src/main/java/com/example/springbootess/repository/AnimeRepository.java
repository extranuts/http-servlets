package com.example.springbootess.repository;


import com.example.springbootess.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AnimeRepository extends JpaRepository<Anime, Integer> {

    List<Anime> findByName(String name);

}
