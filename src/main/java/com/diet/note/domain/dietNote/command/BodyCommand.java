package com.diet.note.domain.dietNote.command;

import com.diet.note.api.request.BodyRequest;
import com.diet.note.domain.dietNote.repository.BodyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class BodyCommand {

    private final BodyRepository bodyRepository;

    public Long create(BodyRequest request) {
        return bodyRepository.save(BodyRequest.toEntity(request)).getId();
    }
}
