package com.diet.note.domain.dietNote.command;

import com.diet.note.api.request.JoinRequest;
import com.diet.note.domain.dietNote.aggregate.User;
import com.diet.note.domain.dietNote.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserCommand {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public Long create(JoinRequest joinRequest) {
        return userRepository.save(
                User.builder()
                        .userId(joinRequest.userId())
                        .password(passwordEncoder.encode(joinRequest.password()))
                        .email(joinRequest.email())
                        .build()).getId();
    }
}
