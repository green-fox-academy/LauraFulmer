package com.greenfoxacademy.usefulutilities.controllers;
import com.greenfoxacademy.usefulutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class Utilities {

    private final UtilityService utilityService;

    @Autowired
    public Utilities(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("useful")
    public String getUsefulLinks() {
        return "links.html";
    }

    @GetMapping("useful/colored")
    public String getColoredBackground(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored.html";
    }

    @GetMapping("useful/email{email}")
    public String validator(Model model, @ModelAttribute(value = "email") String email) {
        model.addAttribute("response", utilityService.validateEmail(email));
        model.addAttribute("fontColor", utilityService.getFontColor(email));
        return "emailvalidator.html";
    }

    @GetMapping("useful/caesarEncoder{string}{number}")
    public String caesarEncode(Model model, @ModelAttribute(value = "string") String string, @ModelAttribute(value = "number") int number) {
        model.addAttribute("codedString", utilityService.caesarEncoder(string, number));
        return "caesarEncoder.html";
    }

    @GetMapping("useful/caesarDecoder{string}{number}")
    public String caesarDecode(Model model, @ModelAttribute(value = "string") String string, @ModelAttribute(value = "number") int number) {
        model.addAttribute("codedString", utilityService.caesarDecoder(string, number));
        return "caesarDecoder.html";
    }
}
