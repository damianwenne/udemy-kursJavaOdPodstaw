package com.udemy.sekcja3_zmienne;

public class TypyProsteKonwertowanie {
    public static void main(String[] args) {
        int i = 6;
        double d = 2.2;

        double d2 = (double)i;

        byte by = 100;
        int i2 = by;

        float f = 123.22f;
        d2 = (double)f;

        long zmiennaLong = 123;
        int zmiennaInt = (int) zmiennaLong;

        // konwertowanie niejawne
        zmiennaLong = zmiennaInt;
        // konwertowanie jawne (rzutowanie)
        zmiennaInt = (int)zmiennaLong;

        zmiennaLong = 1234567890123L;
    }
}
