package com.udemy.sekcja4_operatory;

public class AritmeticOperators {
    public static void main(String[] args) {

        double a = 9;
        double b = 2;

        double dodawanie = a + b;
        System.out.println("Dodawanie: " + dodawanie);

        double dzielenie = a / b;
        System.out.println("Dzielenie: " + dzielenie);

        double resztaZDzielenia = a % b;
        System.out.println("Reszta z dzielenia: " + resztaZDzielenia);

        a += b; // inaczej: a = a + b;
        System.out.println("a = a + b: " + a);

        System.out.println("a: " + a);

        // inkrementacja
        a++;
        System.out.println("a++: " + a);

        //dekrementacja
        a--;
        System.out.println("a--: " + a);
    }
}
