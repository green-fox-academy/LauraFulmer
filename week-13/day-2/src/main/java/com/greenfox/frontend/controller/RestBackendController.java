package com.greenfox.frontend.controller;

import com.greenfox.frontend.models.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestBackendController {

    Greeter greeter = new Greeter();
    AppendA appendA = new AppendA();
    DoUntil doUntil = new DoUntil();

    @GetMapping("doubling")
    public Object getDouble(@RequestParam(required = false) Integer input) {
        if (input == null) {
            ErrorMessage error = new ErrorMessage("Please provide an input!");
            return error;
        } else {
            return new Result(input);
        }
    }

    @GetMapping("greeter")
    public Object getGreeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null) {
            return new ErrorMessage("Please provide a name!");
        } else if (title == null) {
            return new ErrorMessage("Please provide a title!");
        } else {
            return greeter.greet(name, title);
        }
    }

    @GetMapping("appenda/")
    public Object getAppendA(@RequestParam(required = false)  String appendable) {
        if (appendable == null) {
            ErrorMessage error = new ErrorMessage("Error 404");
            return error;
        } else {
            return appendA.append(appendable);
        }
    }

    @PostMapping("dountil/{what}")
    public Object getSumUntil(@RequestParam(required = false) Integer until, @PathVariable(value = "what") String what) {
        if (until == null) {
            ErrorMessage error = new ErrorMessage("Please provide a number");
            return error;
        } else if (what == null) {
            ErrorMessage error = new ErrorMessage("Please provide what you would like to do whit the number.");
            return error;
        } else if (what.equals("sum")) {
            return doUntil.countUntil(until);
        }
        else {
            return doUntil.factorUntil(until);
        }
    }
}
