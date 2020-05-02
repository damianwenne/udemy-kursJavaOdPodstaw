package com.udemy.sekcja4_operatory;

public class OperatoryRelacyjne {
    public static void main(String[] args) {
        // ang. relational operators
        boolean wynik;

        wynik = 8 == 8;

        System.out.println("8 == 8: " + wynik);

        wynik = 3 == 8;
        System.out.println("3 == 8: " + wynik);

        wynik = 3 != 8;
        System.out.println("3 != 8: " + wynik);

        int a = 5;
        int b = 7;
        System.out.println("a == b: " + (a == b));
        System.out.println("a < b: " + (a < b));
    }
}
