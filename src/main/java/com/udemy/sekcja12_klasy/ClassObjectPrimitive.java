package com.udemy.sekcja12_klasy;

public class ClassObjectPrimitive {
    public static void main(String[] args) {
        int typProsty = 100;

        Example przyklad = new Example();
        Example przykladDrugi = new Example();
        przyklad.pole = 123;
        przykladDrugi.pole = 333;
        System.out.println("Przyklad: " + przyklad.pole);
        System.out.println("Przyklad Drugi: " + przykladDrugi.pole);

        System.out.println("Wypisuje Typ Prosty: " + typProsty);


    }
}
