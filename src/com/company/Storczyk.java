package com.company;

public class Storczyk extends Kwiat {
    public Storczyk(String nazwa, Kolor kolor, double cena) {
        super(nazwa, kolor, cena);
    }

    @Override
    public String toString() {
        return nazwa + " (Storczyk) - kolor = " + kolor + ", cena = " + cena;
    }
}