package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

public class Kot extends Ssak{
    @Override
    public void wydajDziwek() {
        System.out.println("Miau Miau");
    }

    @Override
    public void przemieszczanieSie() {
        System.out.println("Lubie chodzic powoli swoimi sciezkami.");
    }
}
