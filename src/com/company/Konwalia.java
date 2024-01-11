package com.company;

public class Konwalia extends Kwiat {
    public Konwalia(String nazwa, Kolor kolor, double cena) {
        super(nazwa, kolor, cena);
    }

    @Override
    public String toString() {
        return nazwa + " (Konwalia) - kolor = " + kolor + ", cena = " + cena;
    }
}
