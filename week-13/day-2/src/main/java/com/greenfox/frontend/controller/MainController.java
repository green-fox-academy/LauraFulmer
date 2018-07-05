package com.greenfox.frontend.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    @GetMapping("/")
    public ModelAndView getFrontEnd() {
        return new ModelAndView("index.html");
    }

    //@GetMapping("/doubling/{input}")
    //public Integer doubling(@PathVariable(value = "input") Integer input) {

    //} {



}
