package com.fag.concessionaria.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fag.concessionaria.interfaces.SaveInterface;
import com.fag.concessionaria.model.Carro;

@Repository
public class OpcionaisRepository implements SaveInterface<Carro> {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public OpcionaisRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Carro carro) {
        String sql = "INSERT INTO opcionais (pneus_novos, chave_reserva, manual, periciado, alarme, ipva_pago, camera_de_re, sensor_de_re, trava_eletrica, vidro_eletrico, ar_condicionado, air_bag, som, id_carro) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Object[] params = {
                carro.isPneus_novos() ? 1 : 0,
                carro.isChave_reserva() ? 1 : 0,
                carro.isManual() ? 1 : 0,
                carro.isPericiado() ? 1 : 0,
                carro.isAlarme() ? 1 : 0,
                carro.isIpva_pago() ? 1 : 0,
                carro.isCamera_de_re() ? 1 : 0,
                carro.isSensor_de_re() ? 1 : 0,
                carro.isTrava_eletrica() ? 1 : 0,
                carro.isVidro_eletrico() ? 1 : 0,
                carro.isAr_condicionado() ? 1 : 0,
                carro.isAir_bag() ? 1 : 0,
                carro.isSom() ? 1 : 0,
                carro.getId()
        };

        jdbcTemplate.update(sql, params);
    }

    @Override
    public void update(Carro carro, Long id) {
        String sql = "UPDATE opcionais SET pneus_novos=?, chave_reserva=?, manual=?, periciado=?, alarme=?, ipva_pago=?, camera_de_re=?, sensor_de_re=?, trava_eletrica=?, vidro_eletrico=?, ar_condicionado=?, air_bag=?, som=? WHERE id_carro=?";
        Object[] params = {
                carro.isPneus_novos() ? 1 : 0,
                carro.isChave_reserva() ? 1 : 0,
                carro.isManual() ? 1 : 0,
                carro.isPericiado() ? 1 : 0,
                carro.isAlarme() ? 1 : 0,
                carro.isIpva_pago() ? 1 : 0,
                carro.isCamera_de_re() ? 1 : 0,
                carro.isSensor_de_re() ? 1 : 0,
                carro.isTrava_eletrica() ? 1 : 0,
                carro.isVidro_eletrico() ? 1 : 0,
                carro.isAr_condicionado() ? 1 : 0,
                carro.isAir_bag() ? 1 : 0,
                carro.isSom() ? 1 : 0,
                id
        };

        jdbcTemplate.update(sql, params);
    }

    @Override
    public Map<String, Object> findById(Long id) {
        // implementação do método findById
        return null;
    }

}
