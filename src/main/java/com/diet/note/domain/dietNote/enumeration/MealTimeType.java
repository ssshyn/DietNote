package com.diet.note.domain.dietNote.enumeration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum MealTimeType {
    BREAKFAST("아침"),
    LAUNCH("점심"),
    DINNER("저녁");

    private final String time;

    @JsonIgnore
    public static MealTimeType of(String text) {
        return Stream.of(MealTimeType.values())
                .filter(type -> type.getTime().equalsIgnoreCase(text))
                .findFirst()
                .orElseThrow();
    }
}
