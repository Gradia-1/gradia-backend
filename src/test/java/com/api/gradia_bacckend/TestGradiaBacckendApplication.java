package com.api.gradia_bacckend;

import org.springframework.boot.SpringApplication;

public class TestGradiaBacckendApplication {

    public static void main(String[] args) {
        SpringApplication.from(GradiaBacckendApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
