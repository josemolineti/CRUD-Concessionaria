package com.fag.concessionaria.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fag.concessionaria.interfaces.SaveInterface;
import com.fag.concessionaria.model.Carro;
import com.fag.concessionaria.repository.OpcionaisRepository;

@Service
public class OpcionaisService implements SaveInterface<Carro> {

    @Autowired
    private OpcionaisRepository opcionaisRepository;

    @Override
    public void save(Carro carro) {
        opcionaisRepository.save(carro);
    }

    @Override
    public void update(Carro carro, Long id) {
        opcionaisRepository.update(carro, id);
    }

    @Override
    public Map<String, Object> findById(Long id) {
        // implementação do método findById
        return null;
    }


}