package com.earth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGateWay9999_App {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateWay9999_App.class,args);
    }
}
