package com.udemy.sekcja13_klasa_string;

public class StringMethods {
    public static void main(String[] args) {
        String tekst = "Jakis tekst";
        System.out.println("Length: " + tekst.length());
        System.out.println("isEmpty: " + tekst.isEmpty());

        char pojedynczyZnak = tekst.charAt(tekst.length() -1);
        System.out.println("charAt: " + pojedynczyZnak);

        System.out.println("Substring: " + tekst.substring(6));
        String substring = tekst.substring(3, 9);
        System.out.println("Substring z dwoma elementami: " + substring);

        String nowyString = " lkjhasq ikasgsdc       ";
        System.out.println("." + nowyString + ".");
        System.out.println("Trim: " + "." + nowyString.trim() + ".");

        String rozneWielkosciLiter = "Rozne litery DUZE i male HahAhAA.";
        System.out.println("To lower case: " + rozneWielkosciLiter.toLowerCase());
        System.out.println("To upper case: " + rozneWielkosciLiter.toUpperCase());

        String czyZawiera = "Czy zawiera jakis tekst.";
        System.out.println("startsWith: " + czyZawiera.startsWith("Czy zawiera"));

        String czyZawieraKoncowke = "Jakis tekst z koncowka";
        System.out.println("Czy zawiera koncowke: " + czyZawieraKoncowke.endsWith("owka"));

        System.out.println("Contains: " + czyZawiera.contains("jakis"));

        System.out.println("Replace: " + czyZawiera.replace('C', 'c'));
    }
}
