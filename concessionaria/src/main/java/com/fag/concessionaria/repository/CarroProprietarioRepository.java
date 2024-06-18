package com.fag.concessionaria.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CarroProprietarioRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CarroProprietarioRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveWithIds(Long carroId, Long proprietarioId) {
        String sql = "INSERT INTO carro_proprietario (id_carro, id_proprietario) VALUES (?, ?)";
        jdbcTemplate.update(sql, carroId, proprietarioId);
    }

    @SuppressWarnings("deprecation")
    public Long getIdProprietarioCarro(Long idCarro) {
        String sql = "SELECT id_proprietario FROM carro_proprietario WHERE id_carro = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] { idCarro }, Long.class);
    }

}
