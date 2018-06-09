package com.earth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册到eureka中
@EnableDiscoveryClient
@EnableCircuitBreaker //对hystrix熔断机制的支持
public class ProviderTianjinHystrix8001_App {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTianjinHystrix8001_App.class,args);
    }
}
