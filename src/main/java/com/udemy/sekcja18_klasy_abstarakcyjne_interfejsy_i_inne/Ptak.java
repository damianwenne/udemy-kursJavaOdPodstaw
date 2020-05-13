package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

public class Ptak implements Zwierze{
    @Override
    public void oddychanie() {
        System.out.println("pluca");
    }

    @Override
    public void odzywianie() {
        System.out.println("robaki");
    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("jajo");
    }
}
