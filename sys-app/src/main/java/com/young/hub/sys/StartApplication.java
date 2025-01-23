package com.young.hub.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Mole. meiko_ooo@163.com
 * @since 2025/1/21 23:30
 */
@SpringBootApplication
@EnableFeignClients
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class);
    }
}
