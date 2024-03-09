package com.diet.note.water.api;

import com.diet.note.water.application.WaterApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/water")
public class WaterApi {
    private final WaterApplication waterApplication;
}
