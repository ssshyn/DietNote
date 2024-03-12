package com.diet.note.domain.dietNote.query;

import com.diet.note.api.response.ExerciseResponse;
import com.diet.note.domain.dietNote.repository.ExerciseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExerciseQuery {
    private final ExerciseRepository exerciseRepository;

    public List<ExerciseResponse> get() {
        return exerciseRepository.findAll().stream().map(ExerciseResponse::new).collect(Collectors.toList());
    }
}
