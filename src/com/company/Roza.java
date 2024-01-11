package com.company;

public class Roza extends Kwiat {
    public Roza(String nazwa, Kolor kolor, double cena) {
        super(nazwa, kolor, cena);
    }

    @Override
    public String toString() {
        return nazwa + " (Róża) - kolor = " + kolor + ", cena = " + cena;
    }
}