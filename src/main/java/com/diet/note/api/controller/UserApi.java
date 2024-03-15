package com.diet.note.api.controller;

import com.diet.note.api.request.JoinRequest;
import com.diet.note.domain.dietNote.command.UserCommand;
import com.diet.note.domain.dietNote.query.UserQuery;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserApi {
    private final UserCommand command;
    private final UserQuery query;

    @GetMapping("/name")
    public String mainP() {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        return "main controller : " + name;
    }
    @Operation(summary = "회원가입", description = "회원가입")
    @PostMapping("/join")
    public ResponseEntity<Void> joinUser(@RequestBody JoinRequest joinRequest) {
        String id = command.create(joinRequest);
        return ResponseEntity.created(
                ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(id).toUri()
        ).build();
    }
}
