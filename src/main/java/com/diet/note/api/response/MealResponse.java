package com.diet.note.api.response;

import com.diet.note.domain.dietNote.aggregate.Meal;

import java.time.LocalDateTime;

public record MealResponse(
        Long id,
        String name,
        Integer mealTimeType,
        Integer fullType,
        Integer score,
        LocalDateTime eatTime,
        String memo,
        Boolean bookmark
) {
    public MealResponse(Meal meal) {
        this(
                meal.getId(),
                meal.getName(),
                meal.getMealTimeType().getTimeId(),
                meal.getFullType().getFullId(),
                meal.getScore(),
                meal.getEatTime(),
                meal.getMemo(),
                meal.getBookmark()
        );
    }
}
