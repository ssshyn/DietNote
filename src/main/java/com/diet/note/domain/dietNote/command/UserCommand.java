package com.diet.note.domain.dietNote.command;

import com.diet.note.api.request.JoinRequest;
import com.diet.note.domain.dietNote.aggregate.User;
import com.diet.note.domain.dietNote.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserCommand {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public String create(JoinRequest joinRequest) {
        if(userRepository.findById(joinRequest.userId()).isPresent()) {
            throw new EntityNotFoundException();
        }



        return userRepository.save(
                User.builder()
                        .id(joinRequest.userId())
                        .password(bCryptPasswordEncoder.encode(joinRequest.password()))
                        .email(joinRequest.email())
                        .build()).getId();
    }
}
