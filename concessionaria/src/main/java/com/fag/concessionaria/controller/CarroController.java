package com.fag.concessionaria.controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fag.concessionaria.join.CarroOpcionaisJoin;

@Controller
public class CarroController {
    @Autowired
    private CarroOpcionaisJoin carroOpcionaisJoin;

    @GetMapping("/car-informations")
    public String carInformations(@RequestParam(name = "carId") Long carId, Model model) {
        Map<String, Object> carro = carroOpcionaisJoin.joinOpcionaisCarro(carId);

        Double preco = (Double) carro.get("preco");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String precoFormatado = numberFormat.format(preco);

        Double quilometragem = (Double) carro.get("quilometragem");
        DecimalFormat decimalFormat = new DecimalFormat("###,###");
        String quilometragemFormatada = decimalFormat.format(quilometragem);

        String placa = (String) carro.get("placa");
        char finalPlaca = placa.charAt(placa.length() - 1);

        carro.put("precoFormatado", precoFormatado);
        carro.put("quilometragemFormatada", quilometragemFormatada);
        carro.put("finalPlaca", finalPlaca);

        // Adicionar o resultado ao modelo
        model.addAttribute("carro", carro);
        return "car_informations";
    }
}
