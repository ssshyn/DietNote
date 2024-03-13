package com.diet.note.api.controller;

import com.diet.note.api.request.JoinRequest;
import com.diet.note.domain.dietNote.command.UserCommand;
import com.diet.note.domain.dietNote.query.UserQuery;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserCommand userCommand;
    private final UserQuery userQuery;

    @Operation(summary = "회원가입", description = "회원가입")
    @PostMapping("/join")
    public ResponseEntity<Void> joinUser(@RequestBody JoinRequest joinRequest) {
        return ResponseEntity.ok(null);
    }
}
