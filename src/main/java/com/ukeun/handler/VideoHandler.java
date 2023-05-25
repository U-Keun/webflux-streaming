package com.ukeun.handler;

import com.ukeun.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class VideoHandler {

    private final VideoService videoService;

    public Mono<ServerResponse> watchVideo(ServerRequest serverRequest) {

        String rangeHeader = serverRequest.headers().firstHeader("Range");
        System.out.println(rangeHeader);
        String videoFile = serverRequest.queryParam("v").get();

        return ServerResponse.ok()
                .body(videoService.getVideo(videoFile), Resource.class);

    }
}
