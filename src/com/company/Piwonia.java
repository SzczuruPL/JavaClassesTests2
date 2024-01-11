package com.company;

public class Piwonia extends Kwiat {
    public Piwonia(String nazwa, Kolor kolor, double cena) {
        super(nazwa, kolor, cena);
    }

    @Override
    public String toString() {
        return nazwa + " (Piwonia) - kolor = " + kolor + ", cena = " + cena;
    }
}