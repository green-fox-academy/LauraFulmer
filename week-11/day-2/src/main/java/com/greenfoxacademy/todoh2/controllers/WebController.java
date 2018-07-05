package com.greenfoxacademy.todoh2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.greenfoxacademy.todoh2.repositories.TodoRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "/todo")
public class WebController {


    private final
    TodoRepository todoRepository;

    @Autowired
    public WebController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/list"})
    public String worksFine(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "index";
    }

    @RequestMapping(value = {"/todo/isActive"})
    public String isActive(Model model) {
        model.addAttribute("todos", todoRepository.findAllByDone(false));
        return "index";
    }
}
