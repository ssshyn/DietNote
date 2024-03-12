package com.diet.note.domain.dietNote.command;

import com.diet.note.api.request.ExerciseRequest;
import com.diet.note.domain.dietNote.repository.ExerciseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExerciseCommand {
    private final ExerciseRepository exerciseRepository;

    public Long create(ExerciseRequest request) {
        return exerciseRepository.save(ExerciseRequest.toEntity(request)).getId();
    }
}
