package com.greenfox.frontend.controller;

import com.greenfox.frontend.models.AppendA;
import com.greenfox.frontend.models.ErrorMessage;
import com.greenfox.frontend.models.Greeter;
import com.greenfox.frontend.models.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestBackendController {

    Greeter greeter = new Greeter();
    AppendA appendA = new AppendA();

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
        if ((name == null) && (title == null)) {
            return new ErrorMessage("Please provide an input!");
        } else {
            return greeter.greet(name, title);
        }
    }

    @GetMapping("appenda/")
    public Object appending(@RequestParam(required = false)  String appendable) {
        if (appendable == null) {
            return "Error 404";
        } else {
            return appendA.append(appendable);
        }
    }
}
