package com.cydeo.controller;


import com.cydeo.entity.Genre;
import com.cydeo.entity.MovieCinema;
import com.cydeo.repository.GenreRepository;
import com.cydeo.repository.MovieCinemaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class Consume_WebClient {

    private final MovieCinemaRepository movieCinemaRepository;
    private final GenreRepository genreRepository;
    private final WebClient webClient = WebClient.builder().baseUrl("http://localhost:8080/").build();

    public Consume_WebClient(MovieCinemaRepository movieCinemaRepository, GenreRepository genreRepository) {
        this.movieCinemaRepository = movieCinemaRepository;
        this.genreRepository = genreRepository;
    }

    @GetMapping("/flux-movie-cinemas")
    public Flux<MovieCinema> readAllCinemaFlux() {
        return Flux.fromIterable(movieCinemaRepository.findAll());
    }

//    @GetMapping("/mono-movie-cinema/{id}")
//    public Mono<MovieCinema> readById(@PathVariable("id") Long id){
//        return  Mono.just(movieCinemaRepository.findById(id).get());
//    }

    @GetMapping("/mono-movie-cinema/{id}")
    public ResponseEntity <Mono<MovieCinema> >readById(@PathVariable("id") Long id){
        return ResponseEntity.ok(Mono.just(movieCinemaRepository.findById(id).get()));
    }

    @PostMapping("/create-genre")
    public Mono<Genre> createGenre(@RequestBody Genre genre){
         return Mono.just(genreRepository.save(genre));

    }











    //---WebClient----

    @GetMapping("/flux")
    public Flux<MovieCinema> readWebClient(){
        return webClient.get().uri("/flux-movie-cinemas").retrieve().bodyToFlux(MovieCinema.class);

    }

 @GetMapping("/mono/{id}")
    public Mono<MovieCinema> readWebClientById(@PathVariable("id") Long id) {
     return webClient.get().uri("/mono-movie-cinema/{id}", id).retrieve().bodyToMono(MovieCinema.class);
 }
















}
