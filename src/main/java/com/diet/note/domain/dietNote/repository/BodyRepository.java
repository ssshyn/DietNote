package com.diet.note.domain.dietNote.repository;

import com.diet.note.domain.dietNote.aggregate.Body;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyRepository extends JpaRepository<Body, Long> {
}
