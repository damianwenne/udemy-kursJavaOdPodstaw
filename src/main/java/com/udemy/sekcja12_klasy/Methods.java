package com.udemy.sekcja12_klasy;

public class Methods {
    public static void main(String[] args) {
        ClassForMethod nazwaObiektu = new ClassForMethod();
        nazwaObiektu.metodaKtoraNicNieZwraca();
        nazwaObiektu.metodaKtoraPrzyjmujeArgument(5, 'A');
        nazwaObiektu.kolejnaMetoda(false, 123);

        int wynikDodawania = nazwaObiektu.dodawanie(10, 5);
        System.out.println("Wynik dodawania: " + wynikDodawania);

        double wynikKolejnejMetody = nazwaObiektu.dodajCosPoPrzecinku(10.00);
        System.out.println("Wynik po przecinku: " + wynikKolejnejMetody);

        System.out.println("Wartosc logiczna: " + nazwaObiektu.zamienWartoscLogiczna(true));

        nazwaObiektu.voidKtoryMialbyCosZwracac(true);
    }
}
