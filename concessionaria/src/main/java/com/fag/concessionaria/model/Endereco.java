package com.fag.concessionaria.model;

public class Endereco {
    private String logradouro;
    private String numero;
    private String cep;

    private String nomeCidade;
    private Long estadoId;
    private Long proprietarioId;

    
    
    @Override
    public String toString() {
        return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", cep=" + cep + ", nomeCidade="
                + nomeCidade + ", estadoId=" + estadoId + ", proprietarioId=" + proprietarioId + "]";
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getNomeCidade() {
        return nomeCidade;
    }
    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
    public Long getEstadoId() {
        return estadoId;
    }
    public void setEstadoId(Long estadoId) {
        this.estadoId = estadoId;
    }
    public Long getProprietarioId() {
        return proprietarioId;
    }
    public void setProprietarioId(Long proprietarioId) {
        this.proprietarioId = proprietarioId;
    }
    
    

    
}
