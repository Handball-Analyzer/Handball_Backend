package com.example.handballanaylzer.repository;

import com.example.handballanaylzer.model.Action;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Action,Long> {
}
