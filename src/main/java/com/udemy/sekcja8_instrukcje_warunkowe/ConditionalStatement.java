package com.udemy.sekcja8_instrukcje_warunkowe;

public class ConditionalStatement {
    public static void main(String[] args) {

        int wiek = 15;
        boolean przyszedlTata = true;
        boolean przyszedlZMama = false;

        if (wiek >= 18) {
            System.out.println("Pozwol na zakup");
        } else if(przyszedlTata) {
            System.out.println("Od razu podaj");
        } else if(wiek < 18 && przyszedlZMama) {
            System.out.println("Pozwol im na zakup");
        } else {
            System.out.println("Nie pozwalaj na zakup");
        }
    }
}
