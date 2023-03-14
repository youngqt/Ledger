package com.tiger.ledger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@EnableMethodSecurity(securedEnabled = true, jsr250Enabled = true)
@SpringBootApplication
@MapperScan("com.tiger.ledger.domain.repository.mapper")
public class LedgerApplication {

    public static void main(String[] args) {
        System.out.println("999");
        SpringApplication.run(LedgerApplication.class, args);
    }

}
