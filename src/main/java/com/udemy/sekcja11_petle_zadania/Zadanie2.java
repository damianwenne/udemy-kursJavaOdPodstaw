package com.udemy.sekcja11_petle_zadania;

public class Zadanie2 {
    public static void main(String[] args) {
        for (int i=0; i<=30; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
            for (int i=0; i<=30; i += 2) {
                    System.out.print(i + " ");
        }
    }
}
