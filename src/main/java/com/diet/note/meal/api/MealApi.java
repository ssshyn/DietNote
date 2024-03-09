package com.diet.note.meal.api;

import com.diet.note.meal.application.MealApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/meal")
public class MealApi {
    private final MealApplication mealApplication;
}
