package com.diet.note.domain.dietNote.query;

import com.diet.note.api.response.WaterResponse;
import com.diet.note.domain.dietNote.repository.WaterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class WaterQuery {
    private final WaterRepository waterRepository;

    public List<WaterResponse> getWaterList() {
        return waterRepository.findAll().stream().map(WaterResponse::new).collect(Collectors.toList());
    }
}
