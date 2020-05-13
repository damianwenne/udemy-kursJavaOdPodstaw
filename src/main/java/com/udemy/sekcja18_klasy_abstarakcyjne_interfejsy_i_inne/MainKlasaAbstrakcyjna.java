package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

public class MainKlasaAbstrakcyjna {
    public static void main(String[] args) {

        KlasaZwyczajna obiekt = new KlasaZwyczajna();
        obiekt.metodaAbstrakcyjna();
        obiekt.metodaZParametrem("Hej");
        obiekt.jakasMetoda();

        Pies pies = new Pies();
        Kot kot = new Kot();
        Kon kon = new Kon();

        System.out.println("Dla psa:");
        pies.przemieszczanieSie();
        pies.wydajDziwek();
        pies.karmieniePotomstwa();
        pies.podajIloscKonczyn();
        pies.temperaturaCiala();
        System.out.println();

        System.out.println("Dla kota:");
        kot.przemieszczanieSie();
        kot.wydajDziwek();
        kot.karmieniePotomstwa();
        kot.podajIloscKonczyn();
        kot.temperaturaCiala();
        System.out.println();

        System.out.println("Dla konia:");
        kon.przemieszczanieSie();
        kon.wydajDziwek();
        kon.karmieniePotomstwa();
        kon.podajIloscKonczyn();
        kon.temperaturaCiala();



    }
}
