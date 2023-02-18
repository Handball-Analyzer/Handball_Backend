package com.example.handball_analyzer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class User {
    @GeneratedValue
    @Id
    private Long id;
    private String firstname;
    private String lastname;
    private Date birthdate;
    private String email;
    private String password;



}