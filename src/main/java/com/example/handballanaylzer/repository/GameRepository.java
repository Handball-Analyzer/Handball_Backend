package com.example.handballanaylzer.repository;

import com.example.handballanaylzer.model.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game,Long> {
}
