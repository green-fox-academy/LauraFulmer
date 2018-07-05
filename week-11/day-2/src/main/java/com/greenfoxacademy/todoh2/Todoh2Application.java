package com.greenfoxacademy.todoh2;

import com.greenfoxacademy.todoh2.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.greenfoxacademy.todoh2.repositories.TodoRepository;

@SpringBootApplication
public class Todoh2Application implements CommandLineRunner {

    private final
    TodoRepository todoRepository;

    @Autowired
    public Todoh2Application (TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Todoh2Application.class, args);
    }

    @Override
    public void run(String... args)  throws Exception {
        todoRepository.save(new Todo("Do the homework", true, true));
        todoRepository.save(new Todo("Bake a cake", true, false));
        todoRepository.save(new Todo("Get a cat", true, false));
        todoRepository.save(new Todo("Feed the cat", false, false));
        todoRepository.save(new Todo("Write your thesis!!", false, false));
        todoRepository.save(new Todo("Pet the cat", false, false));
        todoRepository.save(new Todo("Go outside & leave the computer at home", true, false));
    }
}
