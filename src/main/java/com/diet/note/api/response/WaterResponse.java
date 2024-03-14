package com.diet.note.api.response;

import com.diet.note.domain.dietNote.aggregate.Water;

public record WaterResponse(
        Long id,
        String userId,
        Integer milliliter
) {
    public WaterResponse(Water water) {
        this(
                water.getWaterId(),
                water.getUser().getId(),
                water.getMilliliter()
        );
    }
}
