package com.tiger.ledger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.tiger.ledger.domain.repository.mapper")
@ComponentScan("com.tiger.ledger")
public class LedgerApplication {

    public static void main(String[] args) {
        System.out.println("999");
        SpringApplication.run(LedgerApplication.class, args);
    }

}
