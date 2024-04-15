package com.example.commandlinelab;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CommandlineLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandlineLabApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            String applicationName = ctx.getApplicationName();
            String[] beanNames = ctx.getBeanDefinitionNames();

            System.out.println("applicationName: " + applicationName);
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }

}
