package com.fag.concessionaria.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fag.concessionaria.repository.CarroRepository;

@RestController
@RequestMapping("/list")
public class CatalogoController {
    @Autowired
    private CarroRepository CarroRepository;

    @GetMapping("/catalogo/carro")
    public List<Map<String, Object>> getCarrosCatalogo() {
        return CarroRepository.selectCarro();
    }
    
}
