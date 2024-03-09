package com.diet.note.excercise.repository;

import com.diet.note.excercise.domain.Excercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcerciseRepository extends JpaRepository<Excercise, Long> {
}
