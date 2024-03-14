package com.diet.note.domain.dietNote.aggregate;

import com.diet.note.domain.dietNote.enumeration.FullType;
import com.diet.note.domain.dietNote.enumeration.MealTimeType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Meal {
    @Id
    @GeneratedValue
    private Long id;

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
    private Integer calories;
    private Integer carbohydrate;
    private Integer sodium;
    private Integer sugar;
    private Integer protein;
    private Integer fat;
    // 북마크 여부
    private Boolean bookmark;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), updatable = false)
    private User user;

    private LocalDateTime createdAt = LocalDateTime.now();
}
