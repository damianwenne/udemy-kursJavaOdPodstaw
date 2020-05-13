package com.udemy.sekcja16_klasy_i_dziedziczenie;

public class MainThis {
    public static void main(String[] args) {

        KlasaRozszerzona obiekt1 = new KlasaRozszerzona();
        System.out.println("oddzielenie");
        KlasaRozszerzona obiekt2 = new KlasaRozszerzona(111);
        System.out.println("oddzielenie");
        KlasaRozszerzona obiekt3 = new KlasaRozszerzona(123, 456);

        System.out.println(obiekt3.x);
        System.out.println(obiekt3.y);

        obiekt3.metodaZParametrami(1234567);
        System.out.println("pole: " + obiekt3.pole);

    }
}
