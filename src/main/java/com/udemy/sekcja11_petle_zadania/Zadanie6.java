package com.udemy.sekcja11_petle_zadania;

public class Zadanie6 {
    public static void main(String[] args) {
        int liczba = 5;
        int wynikSilni = 1;
        for (int i=liczba; i>=1; i--) {
            wynikSilni = wynikSilni * i;
        }
        System.out.println("Wynik silni: " + wynikSilni);
    }
}
