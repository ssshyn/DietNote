package com.diet.note.domain.dietNote.query;

import com.diet.note.api.response.BodyResponse;
import com.diet.note.domain.dietNote.repository.BodyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class BodyQuery {
    private final BodyRepository bodyRepository;

    public List<BodyResponse> get() {
        return bodyRepository.findAll().stream().map(BodyResponse::new).collect(Collectors.toList());
    }
}
