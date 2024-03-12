package com.diet.note.domain.dietNote.enumeration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum MealTimeType {
    BREAKFAST(1, "아침"),
    LAUNCH(2, "점심"),
    DINNER(3, "저녁");

    private final Integer timeId;
    private final String time;

    @JsonIgnore
    public static MealTimeType of(String text) {
        return Stream.of(MealTimeType.values())
                .filter(type -> type.getTime().equalsIgnoreCase(text))
                .findFirst()
                .orElseThrow();
    }

    @JsonIgnore
    public static MealTimeType of(Integer timeId) {
        return Stream.of(MealTimeType.values())
                .filter(type -> Objects.equals(type.getTimeId(), timeId))
                .findFirst()
                .orElseThrow();
    }
}
