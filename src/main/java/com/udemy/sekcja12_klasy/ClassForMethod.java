package com.udemy.sekcja12_klasy;

public class ClassForMethod {

    void metodaKtoraNicNieZwraca() {
        System.out.println("Wartosc zwracana z metody z dopisanym tekstem.");
    }

    void metodaKtoraPrzyjmujeArgument(int liczba, char pojedynczyZnak) {
        liczba++;
        System.out.println("Wartosc z metody " + liczba + " " + pojedynczyZnak);
    }

    void kolejnaMetoda(boolean czyPokazac, int liczba) {
        if (czyPokazac) {
            System.out.println("Liczba: " + liczba);
        } else {
            System.out.println("Nie pozwolono pokazac!");
        }
    }

    int dodawanie(int a, int b) {
        int wynik = a + b;
        return wynik;
    }

    double dodajCosPoPrzecinku(double liczbaDouble) {
        double wynik = liczbaDouble + 0.55;
        return wynik;
    }

    boolean zamienWartoscLogiczna(boolean wartoscLogiczna) {
        return !wartoscLogiczna;
    }

    int zwrocOdWartosciLogicznej(boolean czyZwrocic, int liczba) {
        if (czyZwrocic) {
            return liczba;
        } else {
            return 0;
        }
    }

    int przykladKolejnej() {
        System.out.println("Cos przed returnem");
        return 100;
    }

    void voidKtoryMialbyCosZwracac(boolean czyZakonczyc) {
        if (czyZakonczyc) {
            return;
        }
        System.out.println("Cos napisane, bo nie zakonczone wartoscia logiczna.");
    }
}
