package com.fag.concessionaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fag.concessionaria.model.Carro;
import com.fag.concessionaria.repository.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public void saveCarro(Carro carro) {
        System.out.println(carro);
        carroRepository.insertCarro(carro);
    }
}
