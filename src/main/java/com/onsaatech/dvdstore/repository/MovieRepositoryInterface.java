package com.onsaatech.dvdstore.repository;

import com.onsaatech.dvdstore.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepositoryInterface extends CrudRepository<Movie,Long> {
    /*Movie add(Movie movie);
    Iterable<Movie> geta();

    Movie getById(long id);*/
}
