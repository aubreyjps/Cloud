package com.lj.cloudconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.li.service"})
public class CloudConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignApplication.class, args);
    }

}
