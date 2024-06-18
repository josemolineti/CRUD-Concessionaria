package com.fag.concessionaria.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;



public class Proprietario {
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataDeNascimento;
    private String numero;

    
    
    @Override
    public String toString() {
        return "Proprietario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataDeNascimento="
                + dataDeNascimento + ", numero=" + numero + "]";
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
