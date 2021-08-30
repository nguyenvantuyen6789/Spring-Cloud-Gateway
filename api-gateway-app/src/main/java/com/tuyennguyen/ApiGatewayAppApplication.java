package com.tuyennguyen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiGatewayAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayAppApplication.class, args);
    }

    @RequestMapping("/consumer/5")
    public String bookOrder() {
        return "Hello JavaInUse Called in Second Service";
    }

}
