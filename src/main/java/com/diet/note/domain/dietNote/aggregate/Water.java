package com.diet.note.domain.dietNote.aggregate;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Water {
    @Id
    @GeneratedValue
    private Long waterId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), updatable = false)
    private User user;
    private int milliliter;
    private LocalDateTime createdAt = LocalDateTime.now();
}
