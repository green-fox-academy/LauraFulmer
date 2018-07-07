package com.greenfoxacademy.todoh2.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Todo {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private boolean urgent;
    boolean done;

    public Todo() {
    }

    public Todo(String title, Boolean urgent, Boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

}
