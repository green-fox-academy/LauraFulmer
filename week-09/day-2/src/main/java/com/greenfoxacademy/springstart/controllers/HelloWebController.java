package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    AtomicLong loadCounter = new AtomicLong();
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    String[] colors = {"red", "blue", "yellow", "green", "purple", "orange", "pink"};
    Random random = new Random();

    @RequestMapping("web/greeting")
    public String greeting(Model model) {
        int randomHello = random.nextInt(hellos.length);
        int randomColor = random.nextInt(colors.length);
        int randomSize = random.nextInt(100);
        model.addAttribute("name", " name");
        model.addAttribute("loadCounter", loadCounter.incrementAndGet());
        model.addAttribute("size", randomSize);
        model.addAttribute("color", colors[randomColor]);
        model.addAttribute("hello", hellos[randomHello]);
        return "greeting";
    }
}
