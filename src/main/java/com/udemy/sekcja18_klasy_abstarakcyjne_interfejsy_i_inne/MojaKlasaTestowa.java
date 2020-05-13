package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

public abstract class MojaKlasaTestowa implements PrzykladowyInterfejs, DrugiInterface {
    @Override
    public void metodaWInterfejsie() {

    }

    @Override
    public int metodaZParametremWInterfejsie(String z) {
        return 0;
    }

    @Override
    public String metodaZwracaStringa(String str) {
        return null;
    }
}
