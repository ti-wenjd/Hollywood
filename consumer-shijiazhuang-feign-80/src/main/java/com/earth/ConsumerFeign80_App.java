package com.earth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(value = "com.earth")
@ComponentScan(value = "com.earth")
public class ConsumerFeign80_App {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign80_App.class,args);
    }

}
