package com.trade.order.orderstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages = "com.trade.order")
//@MapperScan("com.trade.order.gatewayimpl.database.mapper")
public class OrderStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderStartApplication.class, args);
    }

}
