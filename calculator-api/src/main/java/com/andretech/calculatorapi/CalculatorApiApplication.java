package com.andretech.calculatorapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;


@SpringBootApplication
@ConfigurationPropertiesScan
public class CalculatorApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculatorApiApplication.class, args);
    }

}
