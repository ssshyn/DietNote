package com.diet.note.domain.dietNote.enumeration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum FullType {
    LIGHT(1, "가볍게"),
    NORMAL(2,"적당히"),
    FULL(3,"배부르게"),
    MAX(4,"과하게");

    private final Integer fullId;
    private final String level;


    @JsonIgnore
    public static FullType of(String text) {
        return Stream.of(FullType.values())
                .filter(type -> type.getLevel().equalsIgnoreCase(text))
                .findFirst()
                .orElseThrow();
    }

    @JsonIgnore
    public static FullType of(Integer fullId) {
        return Stream.of(FullType.values())
                .filter(type -> Objects.equals(type.getFullId(), fullId))
                .findFirst()
                .orElseThrow();
    }
}
