package com.example.handballanaylzer.repository;

import com.example.handballanaylzer.model.Extension;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ExtensionRepository extends CrudRepository<Extension, UUID> {
}
