package com.diet.note.api.request;

import com.diet.note.domain.dietNote.aggregate.Water;

public record WaterRequest(
      Integer milliliter
) {
    public static WaterRequest of(Integer milliliter) {
        return new WaterRequest(milliliter);
    }

    public static Water toEntity(WaterRequest request) {
        return Water.builder()
                .milliliter(request.milliliter)
                .build();
    }
}
