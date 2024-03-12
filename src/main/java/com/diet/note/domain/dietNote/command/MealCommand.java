package com.diet.note.domain.dietNote.command;

import com.diet.note.api.request.MealRequest;
import com.diet.note.domain.dietNote.query.MealQuery;
import com.diet.note.domain.dietNote.repository.MealRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MealCommand {

    private final MealRepository mealRepository;

    public Long create(MealRequest mealRequest) {
        return mealRepository.save(MealRequest.toEntity(mealRequest)).getId();
    }
}
