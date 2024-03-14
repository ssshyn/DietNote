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
        Integer calories,
        Integer carbohydrate,
        Integer sodium,
        Integer sugar,
        Integer protein,
        Integer fat,
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
                meal.getCalories(),
                meal.getCarbohydrate(),
                meal.getSodium(),
                meal.getSugar(),
                meal.getProtein(),
                meal.getFat(),
                meal.getMemo(),
                meal.getBookmark()
        );
    }
}
