package com.diet.note.domain.dietNote.aggregate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String id;

    private String password;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Water> water;

    @OneToMany(mappedBy = "user")
    private List<Meal> meals;
}
