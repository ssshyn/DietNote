package com.diet.note.domain.dietNote.repository;

import com.diet.note.domain.dietNote.aggregate.Water;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WaterRepository extends JpaRepository<Water, Long> {
    Optional<Water> findByUserId(String userId);
}
