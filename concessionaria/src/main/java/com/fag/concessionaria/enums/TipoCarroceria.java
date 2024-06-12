package com.fag.concessionaria.enums;

public enum TipoCarroceria {
    Sedan,
    Hatchback,
    SUV,
    Crossover,
    Perua,
    Picape,
    Conversível,
    Cupê,
    Minivan,
    Microvan,
    Roadster,
    Caminhonete,
    Furgão,
    Van;
    
    public static void main(String[] args) {
        for (TipoCarroceria tipo : TipoCarroceria.values()) {
            System.out.println(tipo);
        }
    }
}
