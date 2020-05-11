package com.udemy.sekcja9_instrukcje_warunkowe_zadania;

public class Zadanie3 {
    public static void main(String[] args) {
        double pierwszaLiczba = 10;
        double drugaLiczba = 5;
        char znak = '/';
        double wynik = 0;

        switch (znak) {
            case '+':
                wynik = pierwszaLiczba + drugaLiczba;
                break;
            case '-':
                wynik = pierwszaLiczba - drugaLiczba;
                break;
            case '*':
                wynik = pierwszaLiczba * drugaLiczba;
                break;
            case '/':
                wynik = pierwszaLiczba / drugaLiczba;
                break;
            default:
                System.out.println("Error");

        }
        System.out.println("Wynik dzialania: " + wynik);

    }
}
