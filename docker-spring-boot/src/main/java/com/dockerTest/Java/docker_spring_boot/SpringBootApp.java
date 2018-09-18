package com.dockerTest.Java.docker_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootApp.class, args);
    }

    // @Bean
    // public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
    // return args -> {
    //
    // System.out.println("Let's inspect the beans provided by Spring Boot:");
    //
    // String[] beanNames = ctx.getBeanDefinitionNames();
    // Arrays.sort(beanNames);
    // for (String beanName : beanNames) {
    // System.out.println(beanName);
    // }
    //
    // };
    // }

}
