package com.fag.concessionaria.enums;

public enum TipoDirecao {
    Elétrica,
    Hidráulica,
    Mecânica,
    Elétrica_Hidráulica;
    
    public static void main(String[] args) {
        for (TipoDirecao tipo : TipoDirecao.values()) {
            System.out.println(tipo);
        }
    }
}
