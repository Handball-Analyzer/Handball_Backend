package com.example.handballanaylzer.repository;

import com.example.handballanaylzer.model.Club;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface ClubRepository extends CrudRepository<Club, UUID> {

    @Query("select c.id, c.name from  Club c")
    List <Object> getAllClubNames();
}
