package com.fag.concessionaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private String placa;
    private Double preco;
    private Double quilometragem;
    private String cor;
    private String ano_modelo; // Ano/Modelo
    private String direcao;
    private Integer marchas;
    private String carroceria;
    private String tracao;
    private Integer portas;
    private String procedencia;
    private String chassi;
    private String combustivel;
    private String motor;
    private String marca;
    private String cambio;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Double getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(Double quilometragem) {
        this.quilometragem = quilometragem;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getAno_modelo() {
        return ano_modelo;
    }
    public void setAno_modelo(String ano_modelo) {
        this.ano_modelo = ano_modelo;
    }
    public String getDirecao() {
        return direcao;
    }
    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }
    public Integer getMarchas() {
        return marchas;
    }
    public void setMarchas(Integer marchas) {
        this.marchas = marchas;
    }
    public String getCarroceria() {
        return carroceria;
    }
    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }
    public String getTracao() {
        return tracao;
    }
    public void setTracao(String tracao) {
        this.tracao = tracao;
    }
    public Integer getPortas() {
        return portas;
    }
    public void setPortas(Integer portas) {
        this.portas = portas;
    }
    public String getProcedencia() {
        return procedencia;
    }
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCambio() {
        return cambio;
    }
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    

}