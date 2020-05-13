package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

public class Klasa extends KlasaAbstrakcyjna implements Interfejs, DrugiInterface {
    private int pole;

    public void metodaKlasa() {
        System.out.println("Wykonuje czynnosci w klasie");
    }

    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("Wlasna obsluga w metodzie abstrakcyjnej");
    }

    @Override
    public void metodaInterfejsu() {
        System.out.println("Zaimplementowalem metode z interfejsu w klasie");
    }

    @Override
    public String metodaZwracaStringa(String str) {
        return "Zwracam tekst, bo mi tak kazano";
    }

    @Override
    public int metodaZDrugiegoInterfejsu() {
        return 333;
    }
}
