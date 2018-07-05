package com.greenfoxacademy.dihello;
import com.greenfoxacademy.dihello.services.MyColor;
import com.greenfoxacademy.dihello.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DihelloApplication implements CommandLineRunner {

    private final Printer printer;


    @Autowired
    public DihelloApplication(Printer printer, MyColor myColor) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(DihelloApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log();
    }
}
