package com.diet.note.domain.dietNote.enumeration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum IntensityType {
    LIGHT(1, "가볍게"),
    NORMAL(2, "적당하게"),
    HARD(3, "강하게"),
    INTENSITY(4, "격렬하게");

    private final Integer intensityId;
    private final String intensity;

    @JsonIgnore
    public static IntensityType of(String text) {
        return Stream.of(IntensityType.values())
                .filter(type -> type.getIntensity().equalsIgnoreCase(text))
                .findFirst()
                .orElseThrow();
    }

    @JsonIgnore
    public static IntensityType of(Integer intensityId) {
        return Stream.of(IntensityType.values())
                .filter(type -> Objects.equals(type.getIntensityId(), intensityId))
                .findFirst()
                .orElseThrow();
    }
}
