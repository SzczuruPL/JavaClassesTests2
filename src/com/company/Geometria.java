package com.company;

import java.util.ArrayList;
import java.util.List;

public class Geometria {
    public static void main(String[] args) {
        List<Figura> lista = new ArrayList<>();

        Prostokat p1 = new Prostokat("Tadek", 3.0, 4.0);
        Prostokat p2 = new Prostokat("Franek", 5.0, 6.0);
        Prostokat p3 = new Prostokat("Grzesiu", 7.0, 8.0);

        Kolo k1 = new Kolo("Zdzisek", 3.0);
        Kolo k2 = new Kolo("Włodek", 5.0);
        Kolo k3 = new Kolo("Tymek", 7.0);

        Romb r1 = new Romb("Darek", 3.0, 4.0);
        Romb r2 = new Romb("Marek", 5.0, 6.0);
        Romb r3 = new Romb("Jarek", 7.0, 8.0);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(k1);
        lista.add(k2);
        lista.add(k3);
        lista.add(r1);
        lista.add(r2);
        lista.add(r3);

        for (Figura figura : lista) {
            System.out.println(figura.toString());
        }
    }
}
