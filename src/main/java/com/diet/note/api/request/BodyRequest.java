package com.diet.note.api.request;

import com.diet.note.domain.dietNote.aggregate.Body;
import com.diet.note.domain.dietNote.enumeration.ConditionType;
import lombok.Builder;

@Builder
public record BodyRequest(
        Double weight,
        Double muscleMass,
        Double fat,
        Integer condition,
        String memo
) {
    public static BodyRequest of(Double weight, Double muscleMass, Double fat, Integer condition, String memo) {
        return new BodyRequest(weight, muscleMass, fat, condition, memo);
    }

    public static Body toEntity(BodyRequest request) {
        return Body.builder()
                .weight(request.weight)
                .muscleMass(request.muscleMass)
                .fat(request.fat)
                .conditionType(ConditionType.of(request.condition))
                .memo(request.memo)
                .build();
    }
}
