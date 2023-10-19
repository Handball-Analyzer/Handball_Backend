package com.example.handballanaylzer.dto.backoffice;




import java.time.LocalDate;
import java.util.UUID;

public record UserCreateDto(

        String firstName,

        String lastName,

        String gender,

        String email,

        String password,
        Boolean active,
        String role,

        UUID club_id


) {
}