package com.diet.note.api.response;

import com.diet.note.domain.dietNote.aggregate.Water;

public record WaterResponse(
        Long id,
        Integer milliliter
) {
    public WaterResponse(Water water) {
        this(
                water.getId(),
                water.getMilliliter()
        );
    }
}
