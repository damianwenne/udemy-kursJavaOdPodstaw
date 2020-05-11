package com.udemy.sekcja12_klasy;

public class ClassWithFields {
    int liczbaCalkowita;
    char znak;

    void zwrocWartoscPola() {
        System.out.println("Zwrocona wartosc pola: " + liczbaCalkowita);
    }

    void ustawWartoscPola(int wartosc) {
        liczbaCalkowita = wartosc;
    }

    int zwrocWartoscPolaZMetody() {
        return liczbaCalkowita;
    }
}
