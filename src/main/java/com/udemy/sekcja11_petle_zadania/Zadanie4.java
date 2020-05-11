package com.udemy.sekcja11_petle_zadania;

public class Zadanie4 {
    public static void main(String[] args) {
        int[] tab = {12, 47, 64, 62, 35, 13, 97, 87, 45, 21};

        for (int i=0; i<tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        for (int i=tab.length-1; i>=0; i--) {
            System.out.print(tab[i] + " ");
        }


    }
}
