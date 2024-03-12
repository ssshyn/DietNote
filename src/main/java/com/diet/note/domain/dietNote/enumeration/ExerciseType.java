package com.diet.note.domain.dietNote.enumeration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum ExerciseType {
    CARDIO(1, "유산소"),
    ANAEROBIC(2, "무산소"),
    STRETCH(3, "스트레칭");

    private final Integer exerciseId;
    private final String exercise;

    @JsonIgnore
    public static ExerciseType of(String text) {
        return Stream.of(ExerciseType.values())
                .filter(type -> type.exercise.equalsIgnoreCase(text))
                .findFirst()
                .orElseThrow();
    }

    @JsonIgnore
    public static ExerciseType of(Integer exerciseId) {
        return Stream.of(ExerciseType.values())
                .filter(type -> Objects.equals(type.exerciseId, exerciseId))
                .findFirst()
                .orElseThrow();
    }
}