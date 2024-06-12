package com.fag.concessionaria.enums;

public enum MarcaCarro {
    Alfa_Romeo,
    Audi,
    BMW,
    Chevrolet,
    Citroen,
    Dodge,
    Ferrari,
    Fiat,
    Ford,
    Honda,
    Hyundai,
    Jaguar,
    Jeep,
    Kia,
    Lamborghini,
    Land_Rover,
    Lexus,
    Mazda,
    Mercedes_Benz,
    Mini,
    Mitsubishi,
    Nissan,
    Peugeot,
    Porsche,
    Renault,
    Subaru,
    Toyota,
    Volkswagen,
    Volvo;

    public static void main(String[] args) {
        for (MarcaCarro marca : MarcaCarro.values()) {
            System.out.println(marca);
        }
    }
}
