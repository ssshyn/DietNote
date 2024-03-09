package com.diet.note.meal.repository;

import com.diet.note.meal.domain.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Long, Meal> {
}
