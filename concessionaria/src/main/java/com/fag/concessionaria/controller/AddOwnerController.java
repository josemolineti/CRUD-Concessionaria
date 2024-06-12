package com.fag.concessionaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fag.concessionaria.model.Endereco;
import com.fag.concessionaria.model.Estado;
import com.fag.concessionaria.model.Pais;
import com.fag.concessionaria.model.Proprietario;
import com.fag.concessionaria.repository.EstadoRepository;
import com.fag.concessionaria.repository.PaisRepository;

import java.util.List;

@Controller
public class AddOwnerController {

    @Autowired
    private EstadoRepository estadoRepository;

    @Autowired
    private PaisRepository paisRepository;

    @GetMapping("/add-owner")
    public String showOwnerForm(Model model) {
        model.addAttribute("proprietario", new Proprietario());
        return "add-owner";
    }

    @PostMapping("/add-owner")
    public String addOwner(@ModelAttribute Proprietario proprietario, Model model) {
        System.out.println("Proprietario Details: ");
        System.out.println("Nome: " + proprietario.getNome());
        System.out.println("CPF: " + proprietario.getCpf());
        System.out.println("RG: " + proprietario.getRg());
        System.out.println("Data de Nascimento: " + proprietario.getDataDeNascimento());
        System.out.println("Numero: " + proprietario.getNumero());

        model.addAttribute("proprietario", proprietario);
        return "redirect:/endereco-owner";
    }

    @GetMapping("/endereco-owner")
    public String showAddressForm(Model model) {
        List<Estado> estados = estadoRepository.findAll();
        List<Pais> paises = paisRepository.findAll();

        model.addAttribute("estados", estados);
        model.addAttribute("paises", paises);
        model.addAttribute("endereco", new Endereco());
        return "endereco-owner";
    }

    @PostMapping("/endereco-owner")
    public String addAddress(@ModelAttribute Endereco endereco, Model model) {
        // Salvar endereço e redirecionar conforme necessário
        return "redirect:/next-step";
    }
}
