package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author James han
 * @create 2019-12-13 21:50
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LyItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyItemApplication.class,args);
    }
}
