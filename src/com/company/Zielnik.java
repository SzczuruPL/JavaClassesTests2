package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class Zielnik {
    private List<Kwiat> listaKwiatow;

    public Zielnik() {
        listaKwiatow = new ArrayList<>();
    }

    public void dodajDoZielnika(Kwiat kwiat) {
        listaKwiatow.add(kwiat);
    }

    public void dodajNowyKwiat(String typ, String nazwa, Kwiat.Kolor kolor, double cena) {
        switch (typ) {
            case "RÓŻA":
                listaKwiatow.add(new Roza(nazwa, kolor, cena));
                break;
            case "STORCZYK":
                listaKwiatow.add(new Storczyk(nazwa, kolor, cena));
                break;
            case "KONWALIA":
                listaKwiatow.add(new Konwalia(nazwa, kolor, cena));
                break;
            case "PIWONIA":
                listaKwiatow.add(new Piwonia(nazwa, kolor, cena));
                break;
            default:
                System.out.println("Błędny typ kwiatu!");
        }
    }

    public void wyswietlZielnik() {
        for (Kwiat kwiat : listaKwiatow) {
            System.out.println(kwiat);
        }
    }

    public void sortujDanePoCenie() {
        Collections.sort(listaKwiatow, Comparator.comparingDouble(Kwiat::getCena));
    }

    public static void main(String[] args) {
        Zielnik zielnik = new Zielnik();
        Scanner scanner = new Scanner(System.in);
        int opcja;

        do {
            System.out.println("Wybierz opcję:");
            System.out.println("1 - dodaj do zielnika dwa dowolne wpisy");
            System.out.println("2 - dodaj nowy kwiat");
            System.out.println("3 - wyświetl zielnik");
            System.out.println("4 - posortuj dane po polu cena");
            System.out.println("0 - wyjdź z programu");
            opcja = scanner.nextInt();

            switch (opcja) {
                case 1:
                    zielnik.dodajDoZielnika(new Roza("Andrzej", Kwiat.Kolor.BIAŁY, 21.37));
                    zielnik.dodajDoZielnika(new Piwonia("Janusz", Kwiat.Kolor.CZERWONY, 42.00));
                    break;
                case 2:
                    System.out.println("Podaj typ (Róża, Storczyk, Konwalia, Piwonia):");
                    String typ = scanner.next().toUpperCase();
                    System.out.println("Podaj nazwę:");
                    String nazwa = scanner.next();
                    System.out.println("Podaj kolor (Czerwony, Biały, Różowy, Niebieski):");
                    String kol = scanner.next().toUpperCase();
                    if(kol != "CZERWONY" || kol!="BIAŁY" || kol!="RÓŻOWY" || kol!="NIEBIESKI"){
                        System.out.println("Zły kolor!");
                        break;
                    }
                    Kwiat.Kolor kolor = Kwiat.Kolor.valueOf(kol);
                    System.out.println("Podaj cenę (np. 21,37):");
                    double cena = scanner.nextDouble();

                    zielnik.dodajNowyKwiat(typ, nazwa, kolor, cena);
                    break;
                case 3:
                    zielnik.wyswietlZielnik();
                    break;
                case 4:
                    zielnik.sortujDanePoCenie();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Niepoprawna opcja!");
            }
        } while (opcja != 0);
    }
}
