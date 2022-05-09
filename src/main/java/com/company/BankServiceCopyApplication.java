package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class BankServiceCopyApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankServiceCopyApplication.class, args);
    }
}