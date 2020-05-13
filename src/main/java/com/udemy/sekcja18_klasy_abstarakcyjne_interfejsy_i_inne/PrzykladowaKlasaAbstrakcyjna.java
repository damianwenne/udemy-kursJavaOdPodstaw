package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

public abstract class PrzykladowaKlasaAbstrakcyjna {

    public void jakasMetoda() {
        System.out.println("Cos na ekran");
    }

    public abstract void metodaAbstrakcyjna();

    protected abstract int metodaZParametrem(String z);

}
