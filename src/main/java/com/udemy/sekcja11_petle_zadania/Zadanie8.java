package com.udemy.sekcja11_petle_zadania;

public class Zadanie8 {
    public static void main(String[] args) {
        int n = 5;
        int liczbaGwiazdekLustrzanych = 1;
        int liczbaSpacji = n-1;

        for (int i=1; i<=n; i++) {
            for (int j=1; j<= liczbaSpacji; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=liczbaGwiazdekLustrzanych; k++) {
                System.out.print("*");
            }
            liczbaGwiazdekLustrzanych++;
            liczbaSpacji--;
            System.out.println();
        }

    }
}
