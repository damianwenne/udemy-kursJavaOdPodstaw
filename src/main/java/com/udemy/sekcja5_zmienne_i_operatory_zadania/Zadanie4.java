package com.udemy.sekcja5_zmienne_i_operatory_zadania;

public class Zadanie4 {
    public static void main(String[] args) {
        int liczba = 5;
        int wynikZDzielenia;
        int resztaZDzielenia;

        wynikZDzielenia = liczba / 2;
        resztaZDzielenia = liczba % 2;
        System.out.println(liczba + " / 2 = " + wynikZDzielenia);
        System.out.println(liczba + " % 2 = " + resztaZDzielenia);

        wynikZDzielenia = liczba / 3;
        resztaZDzielenia = liczba % 3;
        System.out.println("\n" + liczba + " / 3 = " +  + wynikZDzielenia);
        System.out.println(liczba + " % 3 = " + resztaZDzielenia);

        wynikZDzielenia = liczba / 11;
        resztaZDzielenia = liczba % 11;
        System.out.println("\n" + liczba + " / 11 = " + wynikZDzielenia);
        System.out.println(liczba + " % 11 = " + resztaZDzielenia);
    }
}
