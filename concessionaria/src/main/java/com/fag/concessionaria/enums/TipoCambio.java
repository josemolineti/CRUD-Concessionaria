package com.fag.concessionaria.enums;

public enum TipoCambio {
    Manual,
    Automático,
    Semi_Automático;
    
    public static void main(String[] args) {
        for (TipoCambio tipo : TipoCambio.values()) {
            System.out.println(tipo);
        }
    }
}
