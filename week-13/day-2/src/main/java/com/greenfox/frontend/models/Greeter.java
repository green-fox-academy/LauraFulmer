package com.greenfox.frontend.models;

import org.springframework.stereotype.Component;

@Component
public class Greeter {

    String name;
    String title;
    String welcome_message;

    public Greeter(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public Greeter() {
    }

    public String greet(String name, String title) {
        welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
        return welcome_message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
