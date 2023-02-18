package com.example.handball_analyzer.model;

import jakarta.persistence.*;

@Entity
@Table
public class Club {
    @GeneratedValue
    @Id
    private Long id;


    private String Name;
    @Column(length = 3)
    private String Kurzel;





}
