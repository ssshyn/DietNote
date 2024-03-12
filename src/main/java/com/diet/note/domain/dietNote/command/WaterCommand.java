package com.diet.note.domain.dietNote.command;

import com.diet.note.api.request.WaterRequest;
import com.diet.note.domain.dietNote.repository.WaterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WaterCommand {
    private final WaterRepository waterRepository;

    public Long create(WaterRequest waterRequest) {
        return waterRepository.save(WaterRequest.toEntity(waterRequest)).getId();
    }
}
