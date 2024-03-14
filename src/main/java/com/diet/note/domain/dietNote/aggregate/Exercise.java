package com.diet.note.domain.dietNote.aggregate;

import com.diet.note.domain.dietNote.enumeration.BodyPartType;
import com.diet.note.domain.dietNote.enumeration.ConditionType;
import com.diet.note.domain.dietNote.enumeration.ExerciseType;
import com.diet.note.domain.dietNote.enumeration.IntensityType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
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

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), updatable = false)
    private User user;

    private LocalDateTime createdAt = LocalDateTime.now();
}
