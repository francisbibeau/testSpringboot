package com.exemple.entrevueSpringBoot.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

import com.exemple.entrevueSpringBoot.entities.Film;
import com.exemple.entrevueSpringBoot.manager.FilmManager;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class FilmControler {
	@Autowired
	FilmManager filmManager;

	@GetMapping(value = "/film/id")
	public ResponseEntity<Film> getFilmById(@PathVariable int id) {
		Optional<Film> film = filmManager.findById(id);
		// return film;
		if (film.isPresent()) {
			return new ResponseEntity<>(film.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/film")
	public ResponseEntity<Film> createFim(@RequestBody Film film) {
		try {
			Film lefilm = filmManager.save(new Film());
			return new ResponseEntity<>(lefilm, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
