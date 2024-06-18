package com.fag.concessionaria.model;

public class Carro {
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
    //opcionais
    private boolean pneus_novos;
    private boolean chave_reserva;
    private boolean manual;
    private boolean periciado;
    private boolean alarme;
    private boolean ipva_pago;
    private boolean camera_de_re;
    private boolean sensor_de_re;
    private boolean trava_eletrica;
    private boolean vidro_eletrico;
    private boolean ar_condicionado;
    private boolean air_bag;
    private boolean som;
    
    
    
    @Override
    public String toString() {
        return "Carro [id=" + id + ", modelo=" + modelo + ", placa=" + placa + ", preco=" + preco + ", quilometragem="
                + quilometragem + ", cor=" + cor + ", ano_modelo=" + ano_modelo + ", direcao=" + direcao + ", marchas="
                + marchas + ", carroceria=" + carroceria + ", tracao=" + tracao + ", portas=" + portas
                + ", procedencia=" + procedencia + ", chassi=" + chassi + ", combustivel=" + combustivel + ", motor="
                + motor + ", marca=" + marca + ", cambio=" + cambio + ", pneus_novos=" + pneus_novos
                + ", chave_reserva=" + chave_reserva + ", manual=" + manual + ", periciado=" + periciado + ", alarme="
                + alarme + ", ipva_pago=" + ipva_pago + ", camera_de_re=" + camera_de_re + ", sensor_de_re="
                + sensor_de_re + ", trava_eletrica=" + trava_eletrica + ", vidro_eletrico=" + vidro_eletrico
                + ", ar_condicionado=" + ar_condicionado + ", air_bag=" + air_bag + ", som=" + som + "]";
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
    public boolean isPneus_novos() {
        return pneus_novos;
    }
    public void setPneus_novos(boolean pneus_novos) {
        this.pneus_novos = pneus_novos;
    }
    public boolean isChave_reserva() {
        return chave_reserva;
    }
    public void setChave_reserva(boolean chave_reserva) {
        this.chave_reserva = chave_reserva;
    }
    public boolean isManual() {
        return manual;
    }
    public void setManual(boolean manual) {
        this.manual = manual;
    }
    public boolean isPericiado() {
        return periciado;
    }
    public void setPericiado(boolean periciado) {
        this.periciado = periciado;
    }
    public boolean isAlarme() {
        return alarme;
    }
    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }
    public boolean isIpva_pago() {
        return ipva_pago;
    }
    public void setIpva_pago(boolean ipva_pago) {
        this.ipva_pago = ipva_pago;
    }
    public boolean isCamera_de_re() {
        return camera_de_re;
    }
    public void setCamera_de_re(boolean camera_de_re) {
        this.camera_de_re = camera_de_re;
    }
    public boolean isSensor_de_re() {
        return sensor_de_re;
    }
    public void setSensor_de_re(boolean sensor_de_re) {
        this.sensor_de_re = sensor_de_re;
    }
    public boolean isTrava_eletrica() {
        return trava_eletrica;
    }
    public void setTrava_eletrica(boolean trava_eletrica) {
        this.trava_eletrica = trava_eletrica;
    }
    public boolean isVidro_eletrico() {
        return vidro_eletrico;
    }
    public void setVidro_eletrico(boolean vidro_eletrico) {
        this.vidro_eletrico = vidro_eletrico;
    }
    public boolean isAr_condicionado() {
        return ar_condicionado;
    }
    public void setAr_condicionado(boolean ar_condicionado) {
        this.ar_condicionado = ar_condicionado;
    }
    public boolean isAir_bag() {
        return air_bag;
    }
    public void setAir_bag(boolean air_bag) {
        this.air_bag = air_bag;
    }
    public boolean isSom() {
        return som;
    }
    public void setSom(boolean som) {
        this.som = som;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    
    
}