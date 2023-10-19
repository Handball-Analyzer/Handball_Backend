package com.example.handballanaylzer.repository;

import com.example.handballanaylzer.model.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SettingsRepository extends JpaRepository<Settings,Long> {
}
