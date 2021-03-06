package com.cb.itoken.service.digiccy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.cb.itoken")
@EnableEurekaClient
@MapperScan(basePackages = {"com.cb.itoken.common.mapper", "com.cb.itoken.service.digiccy.mapper"})
public class ServiceDigiccyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceDigiccyApplication.class, args);
    }
}
