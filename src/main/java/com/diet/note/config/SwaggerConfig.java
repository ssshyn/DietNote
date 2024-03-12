package com.diet.note.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title="API TEST ", description = "testtest", version = "v1")
)
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi openApi() {
        String[] paths = {"/**"};

        return GroupedOpenApi.builder()
                .group("Api v1")
                .pathsToMatch(paths)
                .build();
    }
}
