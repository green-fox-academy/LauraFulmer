package com.greenfoxacademy.todoh2.repositories;

import com.greenfoxacademy.todoh2.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAllByTitle(String title);
    List<Todo> findAllByDone(Boolean done);
}
