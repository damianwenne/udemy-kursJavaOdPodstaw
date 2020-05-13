package com.udemy.sekcja16_klasy_i_dziedziczenie;

public class MainRzutowanieObiektow {
    public static void main(String[] args) {
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();
        klasaRozszerzona.ustawLiczbe(996);
        klasaRozszerzona.wyswietlLiczbe();

        KlasaPodstawowa klasaPodstawowa = (KlasaPodstawowa) klasaRozszerzona;
        klasaPodstawowa.wyswietlLiczbe();

        Object object = klasaPodstawowa;


    }
}
