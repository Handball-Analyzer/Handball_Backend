package com.example.handballanaylzer.model;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class Feature {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String Name;

    @OneToMany(mappedBy = "feature")
    private Set<UsedFeature> usedFeatures;

    public Feature() {
    }

    public Feature(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Set<UsedFeature> getUsedFeatures() {
        return usedFeatures;
    }

    public void setUsedFeatures(Set<UsedFeature> usedFeatures) {
        this.usedFeatures = usedFeatures;
    }
}
