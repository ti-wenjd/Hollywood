package com.earth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册到eureka中
public class ProviderTianjin8002_App {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTianjin8002_App.class,args);
    }
}
