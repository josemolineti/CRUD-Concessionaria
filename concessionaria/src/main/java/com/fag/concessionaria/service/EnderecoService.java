package com.fag.concessionaria.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fag.concessionaria.interfaces.SaveInterface;
import com.fag.concessionaria.model.Endereco;
import com.fag.concessionaria.repository.EnderecoRepository;

@Service
public class EnderecoService implements SaveInterface<Endereco>{

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public void save(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    @Override
    public void update(Endereco endereco, Long id) {
        enderecoRepository.update(endereco, id);
    }

    @Override
    public Map<String, Object> findById(Long id) {
        // implementação do método findById
        return null;
    }
}
