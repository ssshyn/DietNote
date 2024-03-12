package com.diet.note.api.controller;

import com.diet.note.api.request.MealRequest;
import com.diet.note.api.response.MealResponse;
import com.diet.note.domain.dietNote.command.MealCommand;
import com.diet.note.domain.dietNote.query.MealQuery;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@Tag(name = "meals", description = "식단 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/meal")
public class MealApi {
    private final MealCommand command;
    private final MealQuery query;

    @Operation(summary = "조회", description = "조회")
    @GetMapping
    public ResponseEntity<List<MealResponse>> getAll() {
        return ResponseEntity.ok(query.get());
    }

    @Operation(summary = "등록", description = "등록")
    @PostMapping
    public ResponseEntity<Void> save(@RequestBody MealRequest mealRequest) {
        Long id = command.create(mealRequest);
        return ResponseEntity.created(
                ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(id).toUri()
        ).build();
    }
}
