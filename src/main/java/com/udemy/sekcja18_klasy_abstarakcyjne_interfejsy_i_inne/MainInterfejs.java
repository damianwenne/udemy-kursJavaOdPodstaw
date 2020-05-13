package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

public class MainInterfejs {
    public static void main(String[] args) {

        Ryba ryba = new Ryba();
        Ptak ptak = new Ptak();
        Gad gad = new Gad();

        System.out.println("Ryba:");
        ryba.oddychanie();
        ryba.odzywianie();
        ryba.wydawaniePokolenia();
        System.out.println();

        System.out.println("Ptak:");
        ptak.oddychanie();
        ptak.odzywianie();
        ptak.wydawaniePokolenia();
        System.out.println();

        System.out.println("Gad:");
        gad.oddychanie();
        gad.odzywianie();
        gad.wydawaniePokolenia();
        System.out.println();

    }
}
