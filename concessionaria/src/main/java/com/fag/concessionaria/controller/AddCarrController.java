package com.fag.concessionaria.controller;

import com.fag.concessionaria.model.Proprietario;
import com.fag.concessionaria.repository.CarroProprietarioRepository;
import com.fag.concessionaria.service.EnderecoService;
import com.fag.concessionaria.service.ProprietarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fag.concessionaria.enums.CorCarro;
import com.fag.concessionaria.enums.MarcaCarro;
import com.fag.concessionaria.enums.TipoCambio;
import com.fag.concessionaria.enums.TipoCarroceria;
import com.fag.concessionaria.enums.TipoCombustivel;
import com.fag.concessionaria.enums.TipoDirecao;
import com.fag.concessionaria.enums.TipoTracao;
import com.fag.concessionaria.model.Carro;
import com.fag.concessionaria.model.Endereco;
import com.fag.concessionaria.service.CarroService;

@Controller
@SessionAttributes({ "proprietario", "carro", "endereco" })
public class AddCarrController {

    @Autowired
    private CarroService carroService;

    @Autowired
    private ProprietarioService proprietarioService;

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private CarroProprietarioRepository carroProprietarioRepository;

    @GetMapping("/add-new-car")
    public String getEnums(Model model) {
        model.addAttribute("corCarro", CorCarro.values());
        model.addAttribute("marcaCarro", MarcaCarro.values());
        model.addAttribute("tiposCambio", TipoCambio.values());
        model.addAttribute("tipoCarroceria", TipoCarroceria.values());
        model.addAttribute("tipoCombustivel", TipoCombustivel.values());
        model.addAttribute("tipoDirecao", TipoDirecao.values());
        model.addAttribute("tipoTracao", TipoTracao.values());
        model.addAttribute("carro", new Carro());
        return "add-car";
    }

    @PostMapping("/add-new-car")
    public String addCar(@ModelAttribute Carro carro, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("carro", carro);
        return "redirect:/add-owner";
    }

    @GetMapping("/add-owner")
    public String showOwnerForm(Model model) {
        if (!model.containsAttribute("carro")) {
            return "redirect:/add-new-car";
        }
        if (!model.containsAttribute("proprietario")) {
            model.addAttribute("proprietario", new Proprietario());
        }
        return "add-owner";
    }

    @PostMapping("/add-owner")
    public String addOwner(@ModelAttribute Proprietario proprietario, Model model) {
        model.addAttribute("proprietario", proprietario);
        return "redirect:/endereco-owner";
    }

    @GetMapping("/endereco-owner")
    public String showAddressForm(Model model) {
        if (!model.containsAttribute("carro")) {
            return "redirect:/add-new-car";
        }
        if (!model.containsAttribute("endereco")) {
            model.addAttribute("endereco", new Endereco());
        }
        return "endereco-owner";
    }

    @PostMapping("/endereco-owner")
    public String addAddress(@ModelAttribute Endereco endereco,
            @ModelAttribute("proprietario") Proprietario proprietario,
            @ModelAttribute("carro") Carro carro,
            SessionStatus sessionStatus) {
        carroService.save(carro);
        proprietarioService.save(proprietario);
        endereco.setProprietarioId(proprietario.getId());
        enderecoService.save(endereco);

        // Inserir o relacionamento na tabela carro_proprietario
        carroProprietarioRepository.saveWithIds(carro.getId(), proprietario.getId());

        // Limpa os atributos da sessão
        sessionStatus.setComplete();

        return "redirect:/catalogo";
    }

}