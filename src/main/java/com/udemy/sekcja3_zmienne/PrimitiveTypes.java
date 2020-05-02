package com.udemy.sekcja3_zmienne;

public class PrimitiveTypes {
    public static void main(String[] args) {

        // info: 1 bajt = 8 bitow


        // Liczby całkowite
        byte zmiennaByte = 10;
        System.out.println("Zmienna Byte: " + zmiennaByte);
        System.out.println("Byte MAX: " + Byte.MAX_VALUE + "" + " Byte MIN: " + Byte.MIN_VALUE);

        // info: short = 2 bajty = 16 bitow
        short zmiennaShort = 200;
        System.out.println("Short: " + zmiennaShort);
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);

        int zmiennaInt = 1000000;
        System.out.println("Int: " + zmiennaInt);
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

        long zmiennaLong = 100000000000L;
        System.out.println("Long: " + zmiennaLong);
        System.out.println(Long.MIN_VALUE + " " + Long.MIN_VALUE);

        // Liczby Zmiennoprzecinkowe

        float zmiennaFloat = 12.1234567890f;
        System.out.println("Float: " + zmiennaFloat);

        double zmiennaDouble = 12.123467890;
        System.out.println("Double: " + zmiennaDouble);

        // pojedyncze znaki
        char zmiannaChar = 'a';
        System.out.println("Char: " + zmiannaChar);

        // Wartości logiczne
        boolean zmiennaBoolean = true;
        System.out.println("Boolean: " + zmiennaBoolean);


    }
}
