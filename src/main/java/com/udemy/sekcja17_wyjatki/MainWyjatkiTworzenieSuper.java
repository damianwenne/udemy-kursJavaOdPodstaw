package com.udemy.sekcja17_wyjatki;

public class MainWyjatkiTworzenieSuper {
    public static void main(String[] args) {
        try {
            wyrzucKoniecznieJakisWyjatek();
        } catch (JakisException e) {
            System.out.println("Obsluguje odpowiednio wyjatek podczas w catche, " + "a wiadomosc wyjatku to: " + e.getMessage());
        }

    }

    public static void wyrzucKoniecznieJakisWyjatek() throws JakisException {
        throw new JakisException("Specjalna wiadomosc dla was");
    }
}
