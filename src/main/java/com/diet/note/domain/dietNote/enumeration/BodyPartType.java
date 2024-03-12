package com.diet.note.domain.dietNote.enumeration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum BodyPartType {
    ALL(1, "전신"),
    ARM(2, "팔"),
    BELLY(3, "복근"),
    LEGS(4, "하체"),
    BACK(5, "등"),
    SHOULDERS(6, "어깨"),
    CHEST(7, "가슴"),
    WAIST(8, "허리"),
    HEAP(9, "엉덩이"),
    CORE(10, "코어");

    private final Integer bodyId;
    private final String bodyPart;

    @JsonIgnore
    public static BodyPartType of(String text) {
        return Stream.of(BodyPartType.values())
                .filter(type -> type.getBodyPart().equalsIgnoreCase(text))
                .findFirst()
                .orElseThrow();
    }

    @JsonIgnore
    public static BodyPartType of(Integer bodyId) {
        return Stream.of(BodyPartType.values())
                .filter(type -> Objects.equals(type.getBodyId(), bodyId))
                .findFirst()
                .orElseThrow();
    }
}
