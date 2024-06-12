package com.fag.concessionaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fag.concessionaria.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    
}
