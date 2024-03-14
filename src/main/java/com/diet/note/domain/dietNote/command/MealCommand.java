package com.diet.note.domain.dietNote.command;

import com.diet.note.api.request.MealRequest;
import com.diet.note.domain.dietNote.aggregate.Meal;
import com.diet.note.domain.dietNote.repository.MealRepository;
import com.diet.note.domain.dietNote.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MealCommand {

    private final MealRepository mealRepository;
    private final UserRepository userRepository;

    public Long create(MealRequest mealRequest) {
        Meal mealEntity = MealRequest.toEntity(mealRequest);
        mealEntity.setUser(userRepository.findById("adcap").orElseThrow(EntityNotFoundException::new));

        return mealRepository.save(mealEntity).getId();
    }
}
