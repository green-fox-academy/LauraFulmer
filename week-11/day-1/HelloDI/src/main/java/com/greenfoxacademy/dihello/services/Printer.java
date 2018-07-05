package com.greenfoxacademy.dihello.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class Printer {

    private final MyColor myColor;

    @Autowired
    public Printer(MyColor myColor) {
        this.myColor = myColor;
    }

    public void log() {
        myColor.printColor();

    }
}
