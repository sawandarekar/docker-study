package com.dockerTest.Java.docker_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @RequestMapping("/docker")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}