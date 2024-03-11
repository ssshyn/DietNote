package com.diet.note.domain.dietNote.enumeration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum FullType {
    LIGHT("가볍게"),
    NORMAL("적당히"),
    FULL("배부르게"),
    MAX("과하게");

    private final String level;

    @JsonIgnore
    public static FullType of(String text) {
        return Stream.of(FullType.values())
                .filter(type -> type.getLevel().equalsIgnoreCase(text))
                .findFirst()
                .orElseThrow();
    }
}
