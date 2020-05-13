package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

public class Ryba implements Zwierze{
    @Override
    public void oddychanie() {
        System.out.println("Skrzela");
    }

    @Override
    public void odzywianie() {
        System.out.println("robaki");
    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("ikra");
    }
}
