package com.fag.concessionaria.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fag.concessionaria.interfaces.SaveInterface;
import com.fag.concessionaria.model.Proprietario;
import com.fag.concessionaria.repository.ProprietarioRepository;

@Service
public class ProprietarioService implements SaveInterface<Proprietario> {

    @Autowired
    private ProprietarioRepository proprietarioRepository;

    @Override
    public void save(Proprietario proprietario) {
        proprietarioRepository.save(proprietario);
    }

    @Override
    public void update(Proprietario proprietario, Long id) {
        proprietarioRepository.update(proprietario, id);
    }

    @Override
    public Map<String, Object> findById(Long id) {
        // implementação do método findById
        return null;
    }

}
