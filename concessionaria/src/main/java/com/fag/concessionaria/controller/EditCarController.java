package com.fag.concessionaria.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fag.concessionaria.enums.CorCarro;
import com.fag.concessionaria.enums.MarcaCarro;
import com.fag.concessionaria.enums.TipoCambio;
import com.fag.concessionaria.enums.TipoCarroceria;
import com.fag.concessionaria.enums.TipoCombustivel;
import com.fag.concessionaria.enums.TipoDirecao;
import com.fag.concessionaria.enums.TipoTracao;
import com.fag.concessionaria.join.CarroOpcionaisJoin;
import com.fag.concessionaria.model.Carro;
import com.fag.concessionaria.repository.CarroProprietarioRepository;
import com.fag.concessionaria.repository.ProprietarioRepository;
import com.fag.concessionaria.service.CarroService;
import com.fag.concessionaria.service.OpcionaisService;

@Controller
public class EditCarController {

    @Autowired
    private CarroOpcionaisJoin carroOpcionaisJoin;

    @Autowired
    private CarroProprietarioRepository carroProprietarioRepository;

    @Autowired
    private ProprietarioRepository proprietarioRepository;

    @Autowired
    private CarroService carroService;

    @Autowired
    private OpcionaisService opcionaisService;

    @GetMapping("/edit-car")
    public String editCar(@RequestParam("carId") Long carId, Model model) {
        Map<String, Object> carro = carroOpcionaisJoin.joinOpcionaisCarro(carId);
        model.addAttribute("corCarro", CorCarro.values());
        model.addAttribute("marcaCarro", MarcaCarro.values());
        model.addAttribute("tiposCambio", TipoCambio.values());
        model.addAttribute("tipoCarroceria", TipoCarroceria.values());
        model.addAttribute("tipoCombustivel", TipoCombustivel.values());
        model.addAttribute("tipoDirecao", TipoDirecao.values());
        model.addAttribute("tipoTracao", TipoTracao.values());
        model.addAttribute("carro", carro);
        

        return "edit-carro";
    }

    @PostMapping("/edit-car")
    public String updateCar(@RequestParam("carId") Long carId, @ModelAttribute Carro carro) {
        System.out.println(carro.toString());
        carroService.update(carro, carId);
        opcionaisService.update(carro, carId);
        return "catalogo";
    }

    @GetMapping("/edit-proprietario")
    public String editOwner(@RequestParam("carId") Long carId, Model model) {
        Long ownerId = carroProprietarioRepository.getIdProprietarioCarro(carId);
        Map<String, Object> proprietario = proprietarioRepository.findById(ownerId);

        model.addAttribute("owner", proprietario);

        return "edit-owner";
    }
}
