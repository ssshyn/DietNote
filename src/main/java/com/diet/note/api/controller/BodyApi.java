package com.diet.note.api.controller;

import com.diet.note.domain.body.application.BodyApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/body")
public class BodyApi {
    private final BodyApplication bodyApplication;
}
