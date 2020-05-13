package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

public class MainUtrwalenie {
    public static void main(String[] args) {

        Klasa obiektKlasa = new Klasa() {
            @Override
            public void metodaKlasa() {
                System.out.println("Anonimowa klasa: metoda");
            }

            @Override
            public void metodaInterfejsu() {
                System.out.println("Anonimowa klasa: metodaInterfejsu");
            }
        };

        KlasaAbstrakcyjna obiektKlasaAbstrakcyjna = new KlasaAbstrakcyjna() {
            @Override
            public void metodaAbstrakcyjna() {
                System.out.println("Druga klasa anonimowa: metodaAbstrakcyjna");
            }
        };

        DrugiInterface obiektDrugiInterfejs = new DrugiInterface() {

            @Override
            public String metodaZwracaStringa(String str) {
                return "Klasa anonimowa: interfejs";
            }

            @Override
            public int metodaZDrugiegoInterfejsu() {
                return 123456;
            }
        };
    }
}
