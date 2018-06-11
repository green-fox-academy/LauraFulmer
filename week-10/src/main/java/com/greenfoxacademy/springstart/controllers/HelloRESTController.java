package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    @RequestMapping("/greeting")
    public Greeting greeting(AtomicLong lastId, @RequestParam("name") String name) {
        return new Greeting( lastId, "Hello, " + name + " !");
    }
}