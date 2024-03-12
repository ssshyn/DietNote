package com.diet.note.api.controller;

import com.diet.note.api.request.BodyRequest;
import com.diet.note.api.response.BodyResponse;
import com.diet.note.domain.dietNote.command.BodyCommand;
import com.diet.note.domain.dietNote.query.BodyQuery;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/body")
public class BodyApi {

    private final BodyQuery query;
    private final BodyCommand command;

    @Operation(summary = "조회", description = "조회")
    @GetMapping
    public ResponseEntity<List<BodyResponse>> getBody() {
        return ResponseEntity.ok(query.get());
    }

    @Operation(summary = "등록", description = "등록")
    @PostMapping
    public ResponseEntity<Void> saveBody(@RequestBody BodyRequest request) {
        Long id = command.create(request);

        return ResponseEntity.created(
                ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(id).toUri()
        ).build();
    }
}
