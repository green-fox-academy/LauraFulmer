package com.greenfoxacademy.todoh2.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@Getter
@Setter
@Entity
public class Todo {

    @Id
    @GeneratedValue
    Long id;
    String title;
    boolean urgent = false;
    boolean done = false;

    public Todo() {
    }

    public Todo(String title, Boolean urgent, Boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

}
