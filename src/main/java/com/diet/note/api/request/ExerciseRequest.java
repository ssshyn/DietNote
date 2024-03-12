package com.diet.note.api.request;

import com.diet.note.domain.dietNote.aggregate.Exercise;
import com.diet.note.domain.dietNote.enumeration.BodyPartType;
import com.diet.note.domain.dietNote.enumeration.ConditionType;
import com.diet.note.domain.dietNote.enumeration.ExerciseType;
import com.diet.note.domain.dietNote.enumeration.IntensityType;
import lombok.Builder;

@Builder
public record ExerciseRequest(
        String name,
        Integer exerciseTime,
        Integer bodyPart,
        Integer condition,
        Integer exerciseType,
        Integer intensityType,
        String contents,
        Boolean bookmark
) {
    public static ExerciseRequest of(String name, Integer exerciseTime, Integer bodyPart, Integer condition, Integer exerciseType, Integer intensityType, String contents, Boolean bookmark) {
        return new ExerciseRequest(name, exerciseTime, bodyPart, condition, exerciseType, intensityType, contents, bookmark);
    }

    public static Exercise toEntity(ExerciseRequest request) {
        return Exercise.builder()
                .name(request.name)
                .exerciseTime(request.exerciseTime)
                .bodyPartType(BodyPartType.of(request.bodyPart))
                .conditionType(ConditionType.of(request.condition))
                .exerciseType(ExerciseType.of(request.exerciseType))
                .intensityType(IntensityType.of(request.intensityType))
                .contents(request.contents)
                .bookmark(request.bookmark)
                .build();
    }
}
