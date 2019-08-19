package com.stackroute.springbootneo4j.service;

import com.stackroute.springbootneo4j.domain.MovieCritic;
import com.stackroute.springbootneo4j.domain.Movies;

import java.util.Collection;


public interface RatingService {

        MovieCritic saveMovieCritic(MovieCritic movieCritic);


     Collection<MovieCritic> getAllMovieCritics();


     MovieCritic getMovieCriticById(MovieCritic movieCritic);


     MovieCritic deleteCriticById(MovieCritic movieCritic);


     MovieCritic updateMovieCritic(MovieCritic movieCritic);

    Movies getMovieById(Movies movies);

    Movies saveMovie(Movies movies);

    Iterable<Movies> getAllMovies();

    Movies deleteMovieById(Movies movies);

    Movies updateMovieById(Movies movies);
    MovieCritic setRelation(long criticId, long movieId, int rating);
}
