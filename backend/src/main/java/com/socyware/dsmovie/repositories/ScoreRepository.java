package com.socyware.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socyware.dsmovie.entities.Score;
import com.socyware.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
