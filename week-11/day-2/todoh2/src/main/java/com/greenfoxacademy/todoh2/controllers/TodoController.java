package com.greenfoxacademy.todoh2.controllers;

import com.greenfoxacademy.todoh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "todo")
public class TodoController {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "list"})
    public String worksFine(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist.html";
    }

    @RequestMapping(value = {"/todo/isActive"})
    public String isActive(Model model) {
        model.addAttribute("todos", todoRepository.findAllByDone(false));
        return "todolist.html";
    }


}
