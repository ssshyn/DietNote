package com.diet.note.domain.dietNote.repository;

import com.diet.note.domain.dietNote.aggregate.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
