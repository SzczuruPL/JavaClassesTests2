package com.company;

public class Romb extends Figura {
    private double a, h;

    public Romb(String nazwa, double a, double h) {
        super(nazwa);
        this.a = a;
        this.h = h;
    }

    @Override
    public double obwod() {
        return 4 * a;
    }

    @Override
    public double pole() {
        return a * h;
    }

    public String toString() {
        return nazwa + " (Romb) - Obw = " + this.obwod() + ", Pole = " + this.pole();
    }
}
