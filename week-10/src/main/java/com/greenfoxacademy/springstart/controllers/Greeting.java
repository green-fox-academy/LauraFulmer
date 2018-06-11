package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    static AtomicLong lastId = new AtomicLong();

    private String content;

    public Greeting(long id, String content) {
        this.content = content;
        this.lastId.incrementAndGet();
    }

    public String getContent() {

        return content;
    }

    public void setContent(String content) {

        this.content = content;
    }
}
