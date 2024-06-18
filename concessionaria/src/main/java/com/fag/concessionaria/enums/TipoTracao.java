package com.fag.concessionaria.enums;

public enum TipoTracao {
    TRACAO_2X2("2x2"),
    TRACAO_4X4("4x4"),
    Dianteira("Dianteira"),
    Traseira("Traseira");

    private String value;

    TipoTracao(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static void main(String[] args) {
        for (TipoTracao tipo : TipoTracao.values()) {
            System.out.println(tipo);
        }
    }
}