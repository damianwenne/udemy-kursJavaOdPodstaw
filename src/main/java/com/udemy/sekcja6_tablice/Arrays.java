package com.udemy.sekcja6_tablice;

public class Arrays {
    public static void main(String[] args) {
        int[] tablica;
        tablica = new int[10];
        tablica[0] = 5;
        tablica[1] = 10;
        tablica[2] = 55;
        tablica[3] = 155;

        System.out.println(tablica[5]);

        double[] tablicaDouble = new double[5];
        tablicaDouble[0] = 12.5;
        tablicaDouble[1] = 55.5;
        tablicaDouble[2] = 111.11;
        System.out.println(tablicaDouble[3]);

        //int[] nowaTablicaIntow = new int[] {10, 50 ,99 , 101, 55};
        // albo
        int[] nowaTablicaIntow = {10, 50 ,99 , 101, 55};
        System.out.println("Nowa tablica intow: " + nowaTablicaIntow[2]);
        System.out.println("Rozmiar tablicy: " + nowaTablicaIntow.length);




    }
}
