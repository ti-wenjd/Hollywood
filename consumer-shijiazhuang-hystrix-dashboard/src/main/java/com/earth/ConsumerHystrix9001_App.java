package com.earth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开启hystrix监控管理功能
public class ConsumerHystrix9001_App {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrix9001_App.class,args);
    }
}
