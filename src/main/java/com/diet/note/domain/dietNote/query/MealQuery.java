package com.diet.note.domain.dietNote.query;

import com.diet.note.api.response.MealResponse;
import com.diet.note.domain.dietNote.repository.MealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MealQuery {

    private final MealRepository mealRepository;

    public List<MealResponse> get() {
        return mealRepository.findAll().stream().map(MealResponse::new).collect(Collectors.toList());
    }
}
