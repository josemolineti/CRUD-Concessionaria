package com.fag.concessionaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fag.concessionaria.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
}