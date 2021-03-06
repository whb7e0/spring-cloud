package com.wlgs.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author whb
 * @version 1.0
 * @date 2021-07-28 10:17
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ServerApplication.class);
    }
}
