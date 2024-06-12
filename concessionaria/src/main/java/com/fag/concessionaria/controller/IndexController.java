package com.fag.concessionaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalogo")
public class IndexController {

    @GetMapping
    public String renderTelaPrincipal() {
        return "catalogo";
    }
}
