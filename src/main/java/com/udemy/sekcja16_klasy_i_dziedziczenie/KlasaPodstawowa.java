package com.udemy.sekcja16_klasy_i_dziedziczenie;

public class KlasaPodstawowa {
    int pole;
    private int liczba;

    public void ustawLiczbe(int liczba) {
        this.liczba = liczba;
    }

    public void wyswietlLiczbe() {
        System.out.println("Liczba: " + liczba);
    }

    void metoda() {
        System.out.println("Wypisalem z klasy podstawowej");
    }

    KlasaPodstawowa() {
        System.out.println("Konstruktor z klasa podstawowa.");
    }

    KlasaPodstawowa(int a) {
        System.out.println("Konstruktor KlasaPodstawowa z parametrem: " + a);
    }
}
