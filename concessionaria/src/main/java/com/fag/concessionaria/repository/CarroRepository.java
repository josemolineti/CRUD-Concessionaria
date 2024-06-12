package com.fag.concessionaria.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.fag.concessionaria.model.Carro;

@Repository
public class CarroRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CarroRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> selectCarro() {
        String sql = "SELECT * FROM carro";
        return jdbcTemplate.queryForList(sql);
    }

    public void insertCarro(Carro carro) {
        // Imprimir os valores do objeto Carro para depuração
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Preco: " + carro.getPreco());
        System.out.println("Quilometragem: " + carro.getQuilometragem());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("AnoModelo: " + carro.getAno_modelo());
        System.out.println("Direcao: " + carro.getDirecao());
        System.out.println("Marchas: " + carro.getMarchas());
        System.out.println("Carroceria: " + carro.getCarroceria());
        System.out.println("Tracao: " + carro.getTracao());
        System.out.println("Portas: " + carro.getPortas());
        System.out.println("Procedencia: " + carro.getProcedencia());
        System.out.println("Chassi: " + carro.getChassi());
        System.out.println("Combustivel: " + carro.getCombustivel());
        System.out.println("Motor: " + carro.getMotor());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Cambio: " + carro.getCambio());

        // Verificar se todos os valores obrigatórios não são nulos antes de prosseguir
        if (carro.getModelo() != null && carro.getPlaca() != null && carro.getPreco() != null &&
                carro.getQuilometragem() != null && carro.getCor() != null && carro.getAno_modelo() != null &&
                carro.getDirecao() != null && carro.getMarchas() != null && carro.getCarroceria() != null &&
                carro.getTracao() != null && carro.getPortas() != null && carro.getProcedencia() != null &&
                carro.getChassi() != null && carro.getCombustivel() != null && carro.getMotor() != null &&
                carro.getMarca() != null && carro.getCambio() != null) {

            String sql = "INSERT INTO carro (modelo, placa, preco, quilometragem, cor, ano_modelo, direcao, marchas, carroceria, tracao, portas, procedencia, chassi, combustivel, motor, marca, cambio) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
                    carro.getCambio());

            System.out.println("Carro inserido com sucesso.");
        } else {
            System.out.println("Erro: Alguns valores do objeto Carro são nulos.");
        }
    }

}
