package com.diet.note.api.request;

import com.diet.note.domain.dietNote.aggregate.Meal;
import com.diet.note.domain.dietNote.enumeration.FullType;
import com.diet.note.domain.dietNote.enumeration.MealTimeType;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record MealRequest(
        String name,
        Integer mealTimeType,
        Integer fullType,
        Integer score,
        LocalDateTime eatTime,
        String memo,
        Boolean bookmark
) {
    public static MealRequest of(String name, Integer mealTimeType, Integer fullType, Integer score, LocalDateTime eatTime, String memo, Boolean bookmark) {
        return new MealRequest(name, mealTimeType, fullType, score, eatTime, memo, bookmark);
    }

    public static Meal toEntity(MealRequest request) {
        return Meal.builder()
                .name(request.name())
                .mealTimeType(MealTimeType.of(request.mealTimeType))
                .fullType(FullType.of(request.fullType))
                .score(request.score)
                .eatTime(request.eatTime)
                .memo(request.memo)
                .bookmark(request.bookmark)
                .build();
    }
}
