package com.ukeun.router;

import com.ukeun.handler.VideoHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@RequiredArgsConstructor
public class VideoRouter {

    private final VideoHandler videoHandler;

    @Bean
    public RouterFunction<ServerResponse> videoRoutes() {
        return RouterFunctions.route(RequestPredicates.GET("/video"),
                videoHandler::watchVideo);
    }
}
