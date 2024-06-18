package com.fag.concessionaria.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.fag.concessionaria.interfaces.SaveInterface;
import com.fag.concessionaria.model.Proprietario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

@Repository
public class ProprietarioRepository implements SaveInterface<Proprietario> {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProprietarioRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Autowired
    CarroProprietarioRepository carroProprietarioRepository;

    @Override
    public void save(Proprietario proprietario) {
        String sql = "INSERT INTO proprietario (nome, cpf, rg, data_de_nascimento, numero) VALUES (?, ?, ?, ?, ?)";

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, proprietario.getNome());
                ps.setString(2, proprietario.getCpf());
                ps.setString(3, proprietario.getRg());
                ps.setDate(4, java.sql.Date.valueOf(proprietario.getDataDeNascimento()));
                ps.setString(5, proprietario.getNumero());
                return ps;
            }
        }, keyHolder);

        Long proprietarioId = keyHolder.getKey().longValue();
        proprietario.setId(proprietarioId);
    }

    @Override
    public void update(Proprietario proprietario, Long id) {
        
    }

    @Override
    public Map<String, Object> findById(Long id) {
       String sql = "SELECT * FROM proprietario WHERE id = ?";

       return jdbcTemplate.queryForMap(sql, id);
    }
}
