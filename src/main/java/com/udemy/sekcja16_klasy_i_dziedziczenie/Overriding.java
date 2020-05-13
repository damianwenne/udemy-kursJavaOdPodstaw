package com.udemy.sekcja16_klasy_i_dziedziczenie;

public class Overriding {
    public static void main(String[] args) {

        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();

        klasaPodstawowa.metoda();
        klasaRozszerzona.metoda();


    }
}
