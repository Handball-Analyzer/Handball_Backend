package com.example.handballanaylzer.repository;

import com.example.handballanaylzer.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClubRepository extends JpaRepository<Club, UUID> {

Optional<Club> findById(UUID id);
List<Club> findAll();

Boolean existsByName(String name);


}
