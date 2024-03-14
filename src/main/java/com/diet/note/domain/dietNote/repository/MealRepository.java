package com.diet.note.domain.dietNote.repository;

import com.diet.note.domain.dietNote.aggregate.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
    Optional<Meal> findByUserId(String userId);
}
