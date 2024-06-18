package com.fag.concessionaria.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.fag.concessionaria.interfaces.SaveInterface;
import com.fag.concessionaria.model.Carro;
import com.fag.concessionaria.service.OpcionaisService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class CarroRepository implements SaveInterface<Carro> {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CarroRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Autowired
    private OpcionaisService opcionaisService;

    public List<Map<String, Object>> selectCarro() {
        String sql = "SELECT * FROM carro";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public void save(Carro carro) {
        if (carro.getModelo() != null && carro.getPlaca() != null && carro.getPreco() != null &&
                carro.getQuilometragem() != null && carro.getCor() != null && carro.getAno_modelo() != null &&
                carro.getDirecao() != null && carro.getMarchas() != null && carro.getCarroceria() != null &&
                carro.getTracao() != null && carro.getPortas() != null && carro.getProcedencia() != null &&
                carro.getChassi() != null && carro.getCombustivel() != null && carro.getMotor() != null &&
                carro.getMarca() != null && carro.getCambio() != null) {

            String sql = "INSERT INTO carro (modelo, placa, preco, quilometragem, cor, ano_modelo, direcao, marchas, carroceria, tracao, portas, procedencia, chassi, combustivel, motor, marca, cambio) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            KeyHolder keyHolder = new GeneratedKeyHolder();

            jdbcTemplate.update(new PreparedStatementCreator() {
                @Override
                public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                    PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                    ps.setString(1, carro.getModelo());
                    ps.setString(2, carro.getPlaca());
                    ps.setDouble(3, carro.getPreco());
                    ps.setDouble(4, carro.getQuilometragem());
                    ps.setString(5, carro.getCor());
                    ps.setString(6, carro.getAno_modelo());
                    ps.setString(7, carro.getDirecao());
                    ps.setInt(8, carro.getMarchas());
                    ps.setString(9, carro.getCarroceria());
                    ps.setString(10, carro.getTracao());
                    ps.setInt(11, carro.getPortas());
                    ps.setString(12, carro.getProcedencia());
                    ps.setString(13, carro.getChassi());
                    ps.setString(14, carro.getCombustivel());
                    ps.setString(15, carro.getMotor());
                    ps.setString(16, carro.getMarca());
                    ps.setString(17, carro.getCambio());
                    return ps;
                }
            }, keyHolder);

            Long carroId = keyHolder.getKey().longValue();
            carro.setId(carroId);

            // Agora, chamar o método save da classe OpcionaisService
            opcionaisService.save(carro);

            System.out.println("Carro inserido com sucesso.");

        } else {
            System.out.println("Erro: Alguns valores do objeto Carro são nulos.");
        }
    }

    @Override
    public void update(Carro carro, Long carId) {
        String sql = "UPDATE carro SET modelo=?, placa=?, preco=?, quilometragem=?, cor=?, ano_modelo=?, direcao=?, marchas=?, carroceria=?, tracao=?, portas=?, procedencia=?, chassi=?, combustivel=?, motor=?, marca=?, cambio=? WHERE id=?";

        jdbcTemplate.update(sql,
                carro.getModelo(),
                carro.getPlaca(),
                carro.getPreco(),
                carro.getQuilometragem(),
                carro.getCor(),
                carro.getAno_modelo(),
                carro.getDirecao(),
                carro.getMarchas(),
                carro.getCarroceria(),
                carro.getTracao(),
                carro.getPortas(),
                carro.getProcedencia(),
                carro.getChassi(),
                carro.getCombustivel(),
                carro.getMotor(),
                carro.getMarca(),
                carro.getCambio(),
                carId);
    }

    @Override
    public Map<String, Object> findById(Long id) {
        //String sql = "";
        return null;
    }
}
