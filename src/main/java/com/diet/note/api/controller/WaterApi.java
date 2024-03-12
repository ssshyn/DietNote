package com.diet.note.api.controller;

import com.diet.note.api.request.WaterRequest;
import com.diet.note.api.response.WaterResponse;
import com.diet.note.domain.dietNote.command.WaterCommand;
import com.diet.note.domain.dietNote.query.WaterQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/water")
public class WaterApi {
    private final WaterCommand command;
    private final WaterQuery query;
    @GetMapping
    public ResponseEntity<List<WaterResponse>> getWaterList() {
        return ResponseEntity.ok(query.getWaterList());
    }

    @PostMapping
    public ResponseEntity<Void> saveWater(WaterRequest waterRequest) {
        Long id = command.create(waterRequest);
        return ResponseEntity.created(
                ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(id).toUri()
        ).build();
    }
}
