package com.onsaatech.dvdstore.repository.memory;

import com.onsaatech.dvdstore.entity.Movie;
import com.onsaatech.dvdstore.repository.MovieRepositoryInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    public static long lastId=0L;
    private static List<Movie> movies = new ArrayList<>();
    public Movie add(Movie movie) {
        movie.setId(++lastId);
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" and genre "+movie.getGenre()+" has been added.");
        return movie;
    }

    @Override
    public <S extends Movie> S save(S movie) {
        movie.setId(++lastId);
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" and genre "+movie.getGenre()+" has been added.");
        return movie;
    }

    @Override
    public Iterable<Movie> findAll() {
        return movies;
    }

    @Override
    public Optional<Movie> findById(Long id) {
        return movies.stream().
                filter(m -> m.getId()==id).
                findFirst();
    }

    @Override
    public <S extends Movie> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean existsById(Long aLong) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Movie> findAllById(Iterable<Long> longs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteById(Long aLong) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Movie entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll(Iterable<? extends Movie> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException();
    }
}
