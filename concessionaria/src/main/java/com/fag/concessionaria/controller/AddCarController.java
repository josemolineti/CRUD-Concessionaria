package com.fag.concessionaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fag.concessionaria.enums.CorCarro;
import com.fag.concessionaria.enums.MarcaCarro;
import com.fag.concessionaria.enums.TipoCambio;
import com.fag.concessionaria.enums.TipoCarroceria;
import com.fag.concessionaria.enums.TipoCombustivel;
import com.fag.concessionaria.enums.TipoDirecao;
import com.fag.concessionaria.enums.TipoTracao;
import com.fag.concessionaria.model.Carro;
import com.fag.concessionaria.service.CarroService;

@Controller
@RequestMapping("/add-new-car")
public class AddCarController {
    @Autowired
    private CarroService carroService;

    @GetMapping
    public String getEnums(Model model) {
        model.addAttribute("corCarro", CorCarro.values());
        model.addAttribute("marcaCarro", MarcaCarro.values());
        model.addAttribute("tiposCambio", TipoCambio.values());
        model.addAttribute("tipoCarroceria", TipoCarroceria.values());
        model.addAttribute("tipoCombustivel", TipoCombustivel.values());
        model.addAttribute("tipoDirecao", TipoDirecao.values());
        model.addAttribute("tipoTracao", TipoTracao.values());

        return "add-car";
    }

    @PostMapping
    public String addCar(Carro carro, Model model) {
        System.out.println("Dados do carro recebidos: " + carro);
        model.addAttribute("carro", carro);
        return "redirect:/add-owner";
    }

}
