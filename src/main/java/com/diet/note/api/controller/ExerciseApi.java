package com.diet.note.api.controller;

import com.diet.note.api.request.ExerciseRequest;
import com.diet.note.api.response.ExerciseResponse;
import com.diet.note.domain.dietNote.command.ExerciseCommand;
import com.diet.note.domain.dietNote.query.ExerciseQuery;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exercise")
public class ExerciseApi {

    private final ExerciseCommand command;
    private final ExerciseQuery query;

    @Operation(summary = "조회", description = "조회")
    @GetMapping
    public ResponseEntity<List<ExerciseResponse>> getExerciseList() {
        return ResponseEntity.ok(query.get());
    }

    @Operation(summary = "등록", description = "등록")
    @PostMapping
    public ResponseEntity<Void> saveExercise(@RequestBody ExerciseRequest request) {
        Long id = command.create(request);
        return ResponseEntity.created(
                ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("{/id}")
                        .buildAndExpand(id)
                        .toUri()
        ).build();
    }

}
