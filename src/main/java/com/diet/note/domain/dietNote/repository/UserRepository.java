package com.diet.note.domain.dietNote.repository;

import com.diet.note.domain.dietNote.aggregate.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(String userId);
}
