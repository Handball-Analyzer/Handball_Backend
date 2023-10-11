package com.example.handballanaylzer.repository;

import com.example.handballanaylzer.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User,UUID> {

    List< User> findAll();

    Optional<User> findByEmail(String email);

}
