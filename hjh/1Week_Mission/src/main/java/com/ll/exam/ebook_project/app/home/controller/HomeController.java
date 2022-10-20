package com.ll.exam.ebook_project.app.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showMain() {
       return "home/main";
    }
}
