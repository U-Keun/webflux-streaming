package com.ukeun.service;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final String format = "classpath:videos/%s.mp4";

    private final ResourceLoader resourceLoader;

    public Mono<Resource> getVideo(String videoFile) {
        return Mono.fromSupplier(() ->
                resourceLoader.getResource(String.format(format, videoFile)));
    }
}
