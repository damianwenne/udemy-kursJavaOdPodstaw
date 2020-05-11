package com.udemy.sekcja11_petle_zadania;

public class Zadanie5 {
    public static void main(String[] args) {
        int[] tab = {12, 47, 64, 62, 35, 13, 97, 87, 45, 21, -400};
        int suma = 0;
        for (int i=0; i<tab.length; i++) {
            suma += tab[i]; // suma = suma + tab[i];
        }
        System.out.println(suma);
    }
}
