package com.company;

public class Prostokat extends Figura {
    private double a, b;

    public Prostokat(String nazwa, double a, double b) {
        super(nazwa);
        this.a = a;
        this.b = b;
    }

    @Override
    public double obwod() {
        return 2 * (a + b);
    }

    @Override
    public double pole() {
        return a * b;
    }

    public String toString() {
        return nazwa + " (Prostokąt) - Obw = " + this.obwod() + ", Pole = " + this.pole();
    }
}
