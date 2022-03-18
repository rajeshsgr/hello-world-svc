package com.raj.nola.hello.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String ping() {
        return "Hello Everyone!\n";
    }
}
