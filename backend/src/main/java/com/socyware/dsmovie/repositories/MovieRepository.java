package com.socyware.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socyware.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
