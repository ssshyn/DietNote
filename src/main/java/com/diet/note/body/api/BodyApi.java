package com.diet.note.body.api;

import com.diet.note.body.application.BodyApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/body")
public class BodyApi {
    private final BodyApplication bodyApplication;
}
