package com.diet.note.excercise.api;

import com.diet.note.excercise.application.ExcerciseApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("excercise")
public class ExcerciseApi {
    private final ExcerciseApplication excerciseApplication;
}
