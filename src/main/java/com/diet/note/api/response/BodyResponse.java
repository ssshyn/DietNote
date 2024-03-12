package com.diet.note.api.response;

import com.diet.note.domain.dietNote.aggregate.Body;
import com.diet.note.domain.dietNote.enumeration.ConditionType;

public record BodyResponse(
        Long id,
        Double weight,
        Double muscleMass,
        Double fat,
        ConditionType conditionType,
        String memo
) {
    public BodyResponse(Body body) {
        this(
                body.getId(),
                body.getWeight(),
                body.getMuscleMass(),
                body.getFat(),
                body.getConditionType(),
                body.getMemo()
        );
    }
}
