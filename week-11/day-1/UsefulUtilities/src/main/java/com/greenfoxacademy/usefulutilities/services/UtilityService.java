package com.greenfoxacademy.usefulutilities.services;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public String validateEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            return email + " is a valid email address";
        }
        else {
            return email + " is not a valid email address";
        }
    }

    public String getFontColor(String email) {
        if (email.contains("@") && email.contains(".")) {
            return "green";
        }
        else {
            return "red";
        }
    }

    public String caesarEncoder(String text, int number) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result += (char)((int)text.charAt(i) + number);
        }
        return result;
    }

    public String caesarDecoder(String text, int number) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result += (char)((int)text.charAt(i) - number);
        }
        return result;
    }
}
