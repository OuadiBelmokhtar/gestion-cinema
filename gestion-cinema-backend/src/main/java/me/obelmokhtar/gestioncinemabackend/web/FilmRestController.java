package me.obelmokhtar.gestioncinemabackend.web;

import me.obelmokhtar.gestioncinemabackend.repositories.FilmRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmRestController {
private FilmRepository filmRepository;

    public FilmRestController(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
}
