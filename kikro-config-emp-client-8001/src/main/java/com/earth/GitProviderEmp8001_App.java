package com.earth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册到eureka中
public class GitProviderEmp8001_App {

    public static void main(String[] args) {
        SpringApplication.run(GitProviderEmp8001_App.class,args);
    }
}
