package com.udemy.sekcja17_wyjatki;

public class MainWyjatkiObsluga {
    static String str;
    static int[] tablica;

    public static void main(String[] args) {


//        try {
//            System.out.println("Przed wykonaniem");
//            System.out.println("Czy pusty? " + str.isEmpty());
//            System.out.println("Po wykonaniu");
//        } catch (NullPointerException wyjatek) {
//            System.out.println("Nie utworzyles Stringa");
//        }

       tablica = new int[1];
        try {
            tablica[0] = 101;
            tablica[1] = 202;
            tablica[2] = 303;
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Blad z tablica");
        }

        System.out.println("Na koniec programu wypisz to cos.");

    }
}
