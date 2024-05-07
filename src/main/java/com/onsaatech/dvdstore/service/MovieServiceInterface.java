package com.onsaatech.dvdstore.service;

import com.onsaatech.dvdstore.entity.Movie;

import java.util.Optional;

public interface MovieServiceInterface {
    Movie registerMovie(Movie movie);
    Iterable<Movie> getMovieList();

    Movie getMovieById(Long movieNumber);

}
