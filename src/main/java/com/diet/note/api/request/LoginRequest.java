package com.diet.note.api.request;

public record LoginRequest(
        String userId,
        String password
) {
}
