package com.ukeun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ukeun.handler", "com.ukeun.router", "com.ukeun.service"})
public class WebfluxStreamingApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxStreamingApplication.class, args);
    }

}
