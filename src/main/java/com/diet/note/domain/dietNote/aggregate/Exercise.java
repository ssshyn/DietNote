package com.diet.note.domain.dietNote.aggregate;

import com.diet.note.domain.dietNote.enumeration.BodyPartType;
import com.diet.note.domain.dietNote.enumeration.ConditionType;
import com.diet.note.domain.dietNote.enumeration.ExerciseType;
import com.diet.note.domain.dietNote.enumeration.IntensityType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Exercise {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer exerciseTime;
    private BodyPartType bodyPartType;
    private ConditionType conditionType;
    private ExerciseType exerciseType;
    private IntensityType intensityType;
    private String contents;
    private Boolean bookmark;
}
