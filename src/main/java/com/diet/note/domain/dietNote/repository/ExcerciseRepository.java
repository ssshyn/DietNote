package com.diet.note.domain.dietNote.repository;

import com.diet.note.domain.dietNote.aggregate.Excercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcerciseRepository extends JpaRepository<Excercise, Long> {
}
