package com.fag.concessionaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/redirect")
public class NavigationController {

    @GetMapping("/add-new-car")
    public String renderAddCar() {
        return "redirect:/add-new-car";
    }
}
