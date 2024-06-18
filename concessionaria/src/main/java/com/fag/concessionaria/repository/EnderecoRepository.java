package com.fag.concessionaria.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fag.concessionaria.interfaces.SaveInterface;
import com.fag.concessionaria.model.Endereco;

@Repository
public class EnderecoRepository implements SaveInterface<Endereco> {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EnderecoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> selectEstados() {
        String sql = "SELECT * FROM estado";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public void save(Endereco endereco) {
        String sqlCidade = "INSERT INTO cidade (nome, id_estado) VALUES (?, ?)";
        jdbcTemplate.update(sqlCidade, endereco.getNomeCidade(), endereco.getEstadoId());

        Long idCidade = selectUltimaCidade();

        String sqlEndereco = "INSERT INTO endereco (logradouro, numero, cep, id_cidade, id_proprietario) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(
            sqlEndereco, 
            endereco.getLogradouro(), 
            endereco.getNumero(), 
            endereco.getCep(), 
            idCidade,
            endereco.getProprietarioId()
        );
    }

    @Override
    public void update(Endereco endereco, Long id) {
        
    }

    @Override
    public Map<String, Object> findById(Long id) {
        // implementação do método findById
        return null;
    }

    public Long selectUltimaCidade() {
        String sql = "SELECT MAX(id) AS last_id FROM cidade";
        Long id = jdbcTemplate.queryForObject(sql, Long.class);
        return id;
    }
}
