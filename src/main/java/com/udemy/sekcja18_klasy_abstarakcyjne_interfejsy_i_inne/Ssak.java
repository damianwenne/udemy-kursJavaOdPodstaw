package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

public abstract class Ssak {
    public void karmieniePotomstwa() {
        System.out.println("Karmie mlekiem");
    }

    public void temperaturaCiala() {
        System.out.println("MOja temperatura ciala jest stala");
    }

    public void podajIloscKonczyn() {
        System.out.println("Mam 4 konczyny");
    }

    public abstract void wydajDziwek();

    public abstract void przemieszczanieSie();

}
