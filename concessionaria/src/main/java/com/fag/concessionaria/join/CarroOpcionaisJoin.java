package com.fag.concessionaria.join;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CarroOpcionaisJoin {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CarroOpcionaisJoin(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Map<String, Object> joinOpcionaisCarro(Long carId) {
        String sql = "SELECT c.*, o.* FROM carro c INNER JOIN opcionais o ON o.id_carro = c.id WHERE c.id = ?;";
        return jdbcTemplate.queryForMap(sql, carId);
    }
}
