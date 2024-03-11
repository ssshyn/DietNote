package com.diet.note.domain.dietNote.aggregate;

import com.diet.note.domain.dietNote.enumeration.FullType;
import com.diet.note.domain.dietNote.enumeration.MealTimeType;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Meal {
    // user
    // 식단명
    private String name;
    // 분류(아점저)
    private MealTimeType mealTimeType;
    // 포만감
    private FullType fullType;
    // 식단점수
    private Integer score;
    // 시간
    private LocalDateTime eatTime;
    // 메모
    private String memeo;
    // 영양성분

    // 북마크 여부
    private Boolean bookmark;
}
