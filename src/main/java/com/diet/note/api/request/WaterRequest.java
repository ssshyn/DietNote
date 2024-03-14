package com.diet.note.api.request;

import com.diet.note.domain.dietNote.aggregate.User;
import com.diet.note.domain.dietNote.aggregate.Water;

import java.time.LocalDateTime;
import java.util.ArrayList;

public record WaterRequest(
      Integer milliliter
) {
    public static WaterRequest of(Integer milliliter) {
        return new WaterRequest(milliliter);
    }

    public static Water toEntity(WaterRequest request) {
        return Water.builder()
                .createdAt(LocalDateTime.now())
                .milliliter(request.milliliter)
                .build();
    }
}
