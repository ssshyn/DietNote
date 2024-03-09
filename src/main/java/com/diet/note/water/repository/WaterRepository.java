package com.diet.note.water.repository;

import com.diet.note.water.domain.Water;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaterRepository extends JpaRepository<Water, Long> {
}
