package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author James han
 * @create 2019-12-13 20:54
 */
@EnableEurekaServer
@SpringBootApplication
public class LyRegistry {

    public static void main(String[] args) {
        SpringApplication.run(LyRegistry.class);
    }
}
