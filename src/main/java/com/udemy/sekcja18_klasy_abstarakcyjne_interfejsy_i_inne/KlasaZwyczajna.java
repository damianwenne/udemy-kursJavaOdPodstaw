package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

public class KlasaZwyczajna extends PrzykladowaKlasaAbstrakcyjna {
    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("Wypisalem z metody zwyklej");
    }

    @Override
    protected int metodaZParametrem(String z) {
        System.out.println("Wypisuje parametr: " + z);
        return 202;
    }
}
