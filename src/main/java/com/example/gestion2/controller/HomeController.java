package com.example.gestion2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/m1")
    public String Tanger() {
        return "Welcome to tanger";
    }
    @RequestMapping("/m2")
    public String Fes() {
        return "Welcome to Fes";
    }
}
