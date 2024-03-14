package com.diet.note.domain.dietNote.command;

import com.diet.note.api.request.ExerciseRequest;
import com.diet.note.domain.dietNote.aggregate.Exercise;
import com.diet.note.domain.dietNote.repository.ExerciseRepository;
import com.diet.note.domain.dietNote.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExerciseCommand {
    private final ExerciseRepository exerciseRepository;
    private final UserRepository userRepository;

    public Long create(ExerciseRequest request) {
        Exercise exerciseEntity = ExerciseRequest.toEntity(request);
        exerciseEntity.setUser(userRepository.findById("adcap").orElseThrow(EntityNotFoundException::new));

        return exerciseRepository.save(exerciseEntity).getId();
    }
}
