package com.dockerTest.springboot.dockerspringbootwar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @RequestMapping("/docker")
    public String index() {
        return "Greetings from Docker!";
    }

}