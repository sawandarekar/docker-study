package com.dockerTest.springboot.dockerspringbootwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DockerSpringBootWarApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootWarApplication.class, args);
	}
}
