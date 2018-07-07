package com.greenfoxacademy.todoh2.repositories;

import com.greenfoxacademy.todoh2.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAllByTitle(String title);
    List<Todo> findAllByDone(Boolean done);
}
