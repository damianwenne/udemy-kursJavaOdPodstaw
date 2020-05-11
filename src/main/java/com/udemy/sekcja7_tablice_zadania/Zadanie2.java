package com.udemy.sekcja7_tablice_zadania;

public class Zadanie2 {
    public static void main(String[] args) {

        double[][] tabDwu = new double[3][5];

        tabDwu[0][0] = 3.5;
        tabDwu[0][1] = 2.4;
        tabDwu[0][2] = 1.0;
        tabDwu[0][3] = 4.8;
        tabDwu[0][4] = 7.6;

        tabDwu[1][0] = 0.5;
        tabDwu[1][1] = 0.4;
        tabDwu[1][2] = 0.1;
        tabDwu[1][3] = 0.8;
        tabDwu[1][4] = 0.6;

        tabDwu[2][0] = 2.5;
        tabDwu[2][1] = 3.4;
        tabDwu[2][2] = 3.1;
        tabDwu[2][3] = 3.8;
        tabDwu[2][4] = 3.6;

        double sumaPierwszyWiersz = tabDwu[0][0] + tabDwu[0][1] + tabDwu[0][2] + tabDwu[0][3] + tabDwu[0][4];
        double sumaDrugiWiersz = tabDwu[1][0] + tabDwu[1][1] + tabDwu[1][2] + tabDwu[1][3] + tabDwu[1][4];
        double sumaTrzeciWiersz = tabDwu[2][0] + tabDwu[2][1] + tabDwu[2][2] + tabDwu[2][3] + tabDwu[2][4];

        System.out.println("Pierwszy wiersz: " + sumaPierwszyWiersz);
        System.out.println("Drugi wiersz: " + sumaDrugiWiersz);
        System.out.println("Trzeci wiersz: " + sumaTrzeciWiersz);

    }
}
