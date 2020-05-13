package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

public class Pies extends Ssak {

    @Override
    public void wydajDziwek() {
        System.out.println("HauHau");
    }

    @Override
    public void przemieszczanieSie() {
        System.out.println("Lubie biegac na 4 lapach.");
    }
}
