package com.exemple.entrevueSpringBoot.manager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.entrevueSpringBoot.entities.Film;
@Repository
public interface FilmManager extends JpaRepository<Film,Integer>{

}
