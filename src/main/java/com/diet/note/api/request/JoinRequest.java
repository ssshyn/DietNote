package com.diet.note.api.request;

import com.diet.note.domain.dietNote.aggregate.User;

public record JoinRequest(
        String userId,
        String password,
        String email
) {
}
