package com.diet.note.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.security.OAuthFlow;
import io.swagger.v3.oas.models.security.OAuthFlows;
import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

@OpenAPIDefinition(
        info = @Info(title="API TEST", description = "testtest", version = "v1")
)
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi openApi() {
        String[] paths = {"/**"};

        SecurityScheme securityScheme = new SecurityScheme()
                .type(SecurityScheme.Type.OAUTH2)
                .in(SecurityScheme.In.HEADER)
                .scheme("bearer")
                .bearerFormat("JWT")
                .name(HttpHeaders.AUTHORIZATION)
                .flows(
                        new OAuthFlows()
                                .password(
                                        new OAuthFlow()
                                                .authorizationUrl("/api/oauth2/authorize")
                                                .tokenUrl("/api/oauth2/token")
                                )
                );

        return GroupedOpenApi.builder()
                .group("Api v1")
                .pathsToMatch(paths)
                .build();
    }
}
