package com.example.springbootess.repository;


import com.example.springbootess.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;


@Repository
//@RepositoryRestResource(path = "animme")
public interface AnimeRepository extends JpaRepository<Anime, Integer> {

    List<Anime> findByName(String name);

//    @RestResource(path= "ani", rel = "ani")
//    List<Anime>findByName(String name);

}
