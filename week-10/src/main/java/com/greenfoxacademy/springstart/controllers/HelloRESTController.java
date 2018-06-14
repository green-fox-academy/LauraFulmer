package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong lastId = new AtomicLong();

    @RequestMapping("/greeting")
    public List<Greeting> greeting(@RequestParam("name") String name) {
        return Arrays.asList(new Greeting(lastId.incrementAndGet(), "Hello, " + name + " !"));
    }
}