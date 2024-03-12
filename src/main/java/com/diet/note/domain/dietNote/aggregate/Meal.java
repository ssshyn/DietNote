package com.diet.note.domain.dietNote.aggregate;

import com.diet.note.domain.dietNote.enumeration.FullType;
import com.diet.note.domain.dietNote.enumeration.MealTimeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Meal {
    @Id
    @GeneratedValue
    private Long id;
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
    private String memo;
    // 영양성분

    // 북마크 여부
    private Boolean bookmark;
}
