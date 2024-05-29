package com.crudspring.crudspring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * HelloController
 */
@RestController

public class HelloController {

    @GetMapping("/helo")
    public String helo() {
        return "Olá mundo!";
    }
    
}