package com.fag.concessionaria.enums;

public enum CorCarro {
    Preto,
    Branco,
    Prata,
    Cinza,
    Vermelho,
    Azul,
    Verde,
    Marrom,
    Amarelo,
    Laranja;
    
    public static void main(String[] args) {
        for (CorCarro cor : CorCarro.values()) {
            System.out.println(cor);
        }
    }
}

