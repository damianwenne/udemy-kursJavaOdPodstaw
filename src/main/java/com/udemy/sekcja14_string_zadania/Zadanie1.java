package com.udemy.sekcja14_string_zadania;

/*
1. Utwórz trzy zmienne typu String. Do pierwszej przypisz swoje imię, do drugiej nazwisko oraz do trzeciej imię i nazwisko oddzielone spacją.
   Następnie wykonaj polecenia używając odpowiednich metod z String (nie robić nic ręcznie! :) ) i wypisując informacje na ekran:
a) wypisz ile znaków zawiera zmienna przechowująca imię, ile nazwisko a ile imię i nazwisko
b) sprawdź czy Twoje imię jest równe "Alicja" lub "Jan"
c) wypisz nazwisko z WIELKICH LITER
d) zamień w nazwisku litery 'a' na 'e' i zobacz czy coś się zmieniło
*/
public class Zadanie1 {
    public static void main(String[] args) {
        String imie = "Damian";
        String nazwisko = "Wenne";
        String imieINazwisko = imie + " " + nazwisko;

        System.out.println("Liter w imieniu: " + imie.length());
        System.out.println("Liter w naziwsku: " + nazwisko.length());
        System.out.println("Liter w imieniu i nazwisku: " + imieINazwisko.length());

        System.out.println("\nDamian rowna sie Alicja?: " + imie.equals("Alicaj"));
        System.out.println("Damian rowna sie Jan?: " + imie.equals("Jan"));

        System.out.println("\nNazwisko wielkimi: " + nazwisko.toUpperCase());

        System.out.println("\nNazwisko zamiana e->a: " + nazwisko.replace('e', 'a'));
    }
}
