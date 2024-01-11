package com.company;

public class Kolo extends Figura {
    private double r;

    public Kolo(String nazwa, double r) {
        super(nazwa);
        this.r = r;
    }

    @Override
    public double obwod() {
        return 2 * Math.PI * r;
    }

    @Override
    public double pole() {
        return Math.PI * Math.pow(r, 2);
    }

    public String toString() {
        return nazwa + " (Kolo) - Obw = " + this.obwod() + ", Pole = " + this.pole();
    }
}