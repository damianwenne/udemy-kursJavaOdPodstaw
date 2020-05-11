package com.udemy.sekcja10_petle_for;

public class LoopsAndArrays {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = 5 + i;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Tab " + i + " = " + tab[i]);
        }

    }
}
