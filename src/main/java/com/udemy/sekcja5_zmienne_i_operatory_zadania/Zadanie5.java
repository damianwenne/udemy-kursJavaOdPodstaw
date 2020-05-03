package com.udemy.sekcja5_zmienne_i_operatory_zadania;

public class Zadanie5 {
    public static void main(String[] args) {
        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
        boolean wynikDrugi = x < 10  && x != 0 && x > -1;
        System.out.println("Wynik pierwszy: " + wynikPierwszy);
        System.out.println("Wynik drugi: " + wynikDrugi);
    }


}
