package com.greenfoxacademy.greenfox.controllers;
import com.greenfoxacademy.greenfox.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GFAController {
    private final StudentService studentService;

    @Autowired
    public GFAController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("gfa")
    public String getMain(Model model) {
        model.addAttribute("numberOfStudents", studentService.count());
        return "main.html";
    }

    @GetMapping("gfa/list")
    public String getStudentList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students.html";
    }

    @GetMapping("gfa/add")
    public String addStudent() {
        return "addStudent.html";
    }

    @PostMapping("gfa/add")
    public String saveStudent(@ModelAttribute(value = "name") String name) {
        studentService.save(name);
        return "saved.html";
    }

    @RequestMapping("gfa/redirect")
    public String redirect() {
        return "redirect:/gfa";
    }

    @GetMapping("gfa/check")
    public String checkStudent() {
        return "check.html";
    }

    @PostMapping("gfa/check")
    public String checked(Model model, @ModelAttribute(value = "checkName") String name) {
        model.addAttribute("check", studentService.check(name));
        return "checked.html";
    }
}
