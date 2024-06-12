package com.fag.concessionaria.enums;

public enum TipoCombustivel {
    Gasolina,
    Etanol,
    Diesel,
    GNV,
    Flex,
    Híbrido,
    Elétrico;
    
    public static void main(String[] args) {
        for (TipoCombustivel tipo : TipoCombustivel.values()) {
            System.out.println(tipo);
        }
    }
}
