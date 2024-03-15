package com.diet.note.domain.dietNote.aggregate;

import com.diet.note.domain.dietNote.enumeration.Authority;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String id;

    private String password;
    private String email;
    private String role;

//    @Enumerated(EnumType.STRING)
//    private Authority authority;

    @OneToMany(mappedBy = "user")
    private List<Water> water;

    @OneToMany(mappedBy = "user")
    private List<Meal> meals;

    @OneToMany(mappedBy = "user")
    private List<Exercise> exercises;
}
