package com.dh.catalogservice.service;

import com.dh.catalogservice.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getMoviesByGenre(String genre, Boolean throwError);
}
