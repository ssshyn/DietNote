package com.diet.note.domain.dietNote.command;

import com.diet.note.api.request.WaterRequest;
import com.diet.note.domain.dietNote.aggregate.Water;
import com.diet.note.domain.dietNote.repository.UserRepository;
import com.diet.note.domain.dietNote.repository.WaterRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WaterCommand {
    private final WaterRepository waterRepository;
    private final UserRepository userRepository;

    public Long create(WaterRequest waterRequest) {
        Water waterEntity = waterRepository.findByUserId("adcap").orElse(new Water());
        waterEntity.setUser(userRepository.findById("adcap").orElseThrow(EntityNotFoundException::new));
        waterEntity.setMilliliter(waterEntity.getMilliliter() + waterRequest.milliliter());

        return waterRepository.save(waterEntity).getWaterId();
    }
}
