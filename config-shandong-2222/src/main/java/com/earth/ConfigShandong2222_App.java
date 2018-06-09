package com.earth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigShandong2222_App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigShandong2222_App.class,args);
    }
}
