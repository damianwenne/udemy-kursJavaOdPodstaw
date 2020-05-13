package com.udemy.sekcja16_klasy_i_dziedziczenie;

public class KlasaRozszerzona extends KlasaPodstawowa {

    int x;
    int y;
    int z;
    int v;
    int pole;

    public void metodaRozszerzona() {
        System.out.println("metodaRozszerzona");
    }

    @Override
    void metoda() {
        super.metoda();
        System.out.println("Kolejny tekst czy operacje w klasie rozszerzonej");
    }

    KlasaRozszerzona() {
        System.out.println("Konstruktor z klasa rozszerzona");
    }

    KlasaRozszerzona(int x) {
        this.x = x;
        System.out.println("Konstruktor z klasa rozszerzona z parametrem: " + x);
    }

    KlasaRozszerzona(int x, int y) {
        this(x);
        this.y = y;
        System.out.println("Konstruktor z klasa rozszerzona z parametrami: " + x + " " + y);
    }

    void metodaZTejKlasy() {

    }

    void metodaZParametrami(int pole) {
        this.pole = pole;

    }
}
