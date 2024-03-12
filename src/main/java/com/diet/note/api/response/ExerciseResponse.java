package com.diet.note.api.response;

import com.diet.note.domain.dietNote.aggregate.Exercise;
import com.diet.note.domain.dietNote.enumeration.BodyPartType;
import com.diet.note.domain.dietNote.enumeration.ConditionType;
import com.diet.note.domain.dietNote.enumeration.ExerciseType;
import com.diet.note.domain.dietNote.enumeration.IntensityType;

public record ExerciseResponse(
        Long id,
        String name,
        Integer exerciseTime,
        BodyPartType bodyPartType,
        ConditionType conditionType,
        ExerciseType exerciseType,
        IntensityType intensityType,
        String contents,
        Boolean bookmark
) {
    public ExerciseResponse(Exercise exercise) {
        this(
                exercise.getId(),
                exercise.getName(),
                exercise.getExerciseTime(),
                exercise.getBodyPartType(),
                exercise.getConditionType(),
                exercise.getExerciseType(),
                exercise.getIntensityType(),
                exercise.getContents(),
                exercise.getBookmark()
        );
    }
}
