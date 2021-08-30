package com.tuyennguyen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecondAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondAppApplication.class, args);
    }

    @RequestMapping("/consumer/message")
    public String bookOrder() {
        return "Hello JavaInUse Called in Second Service";
    }

}
