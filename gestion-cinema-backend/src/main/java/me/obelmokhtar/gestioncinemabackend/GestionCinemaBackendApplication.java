package me.obelmokhtar.gestioncinemabackend;

import me.obelmokhtar.gestioncinemabackend.entities.Film;
import me.obelmokhtar.gestioncinemabackend.repositories.FilmRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class GestionCinemaBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionCinemaBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner initDB(FilmRepository filmRepository) {
        return args -> {
            Film film1 = Film.builder().titre("titre 1")
                    .description("desc 1").realisateur("realisateur 1")
                    .dateSortie(new Date()).duree(60)
                    .photo("photo 1").build();
            Film film2 = Film.builder().titre("titre 2")
                    .description("desc 2").realisateur("realisateur 2")
                    .dateSortie(new Date()).duree(90)
                    .photo("photo 2").build();
            filmRepository.save(film1);
            filmRepository.save(film2);
        };
    }
}
