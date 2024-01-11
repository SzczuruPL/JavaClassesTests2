package com.company;

public abstract class Kwiat {
    protected String nazwa;
    protected Kolor kolor;
    protected double cena;

    public enum Kolor {
        CZERWONY, BIAŁY, RÓŻOWY, NIEBIESKI
    }

    public Kwiat(String nazwa, Kolor kolor, double cena) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }
}

