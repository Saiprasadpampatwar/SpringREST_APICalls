package com.myfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Hii from Sai");
        SpringApplication.run(DemoApplication.class, args);
    }

}
