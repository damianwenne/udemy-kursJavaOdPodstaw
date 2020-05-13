package com.udemy.sekcja15_klasy_kontynuacja;

public class NamoOfClass {
    public static final String NAZWA_STRING = "Nazwa dla Stringa";
    private String polePrywatneString = "Jakis prywatny String";
    int nazwaZmiennej = 55;

    public void nazwaMetodyVoid() {
        int nazwaZmiennej = 44;
        System.out.println("Wypisalem z metody void");
        metodaZwracaInta(5);

        System.out.println(nazwaZmiennej);
        System.out.println(this.nazwaZmiennej);

//        metodaPrzyjmujeParametr(5);
//        metodaPrzyjmujeParametr("Jakis tekst");
    }

    public void drugaMetoda() {
        int nazwaZmiennej;
        System.out.println("Druga metoda");
    }

    private int metodaZwracaInta(int a) {
        return a;
    }

//    private int metodaPrzyjmujeParametr(int a) {
//        return a;
//    }
//
//    private String metodaPrzyjmujeParametr(String a) {
//        return 5;
//    }

    private int metodaPrzyjmujeParametr(int a, String b) {
        return 55;
    }

//    private int metodaPrzyjmujeParametr(int a) {
//        return "Jakis tekst";
//    }


}
