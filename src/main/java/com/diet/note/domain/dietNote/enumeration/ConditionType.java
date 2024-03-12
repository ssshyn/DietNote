package com.diet.note.domain.dietNote.enumeration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum ConditionType {
    WORST(1, "최악"),
    BAD(2, "나쁨"),
    NORMAL(3, "보통"),
    GOOD(4, "좋음"),
    BEST(5, "최상");

    private final Integer conditionId;
    private final String condition;

    @JsonIgnore
    public static ConditionType of(String text) {
        return Stream.of(ConditionType.values())
                .filter(type -> type.getCondition().equalsIgnoreCase(text))
                .findFirst()
                .orElseThrow();
    }

    @JsonIgnore
    public static ConditionType of(Integer conditionId) {
        return Stream.of(ConditionType.values())
                .filter(type -> Objects.equals(type.getConditionId(), conditionId))
                .findFirst()
                .orElseThrow();
    }
}
