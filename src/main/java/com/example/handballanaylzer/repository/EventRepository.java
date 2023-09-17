package com.example.handballanaylzer.repository;

import com.example.handballanaylzer.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event,Long> {
}
