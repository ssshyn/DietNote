package com.diet.note.domain.dietNote.aggregate;

import com.diet.note.domain.dietNote.enumeration.ConditionType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Body {
    @Id
    @GeneratedValue
    private Long id;

    private Double weight;
    private Double muscleMass;
    private Double fat;
    private ConditionType conditionType;
    private String memo;
}
