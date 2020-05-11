package com.udemy.sekcja10_petle_for;

public class BreakAndContinueLoop {
    public static void main(String[] args) {
        int zmienna;
        for (zmienna = 1; zmienna <= 20; zmienna++) {
            if (zmienna == 18) { // mozna uzyc ==, <, <= itd
                continue;
            }
            System.out.println("Zmienna: " + zmienna);
        }

        for (zmienna = 1; zmienna <= 20; zmienna++) {
            if (zmienna >= 5) {
                break;
            }
            System.out.println("Zmienna w drugiej petli: " + zmienna);
        }

        for (zmienna = 1; true; zmienna++) {
            if (zmienna == 100) {
                break;
            }
            System.out.println("Zmienna w trzeciej petli: " + zmienna);
        }
    }
}
