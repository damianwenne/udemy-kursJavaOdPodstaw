package com.udemy.sekcja12_klasy;

public class ClassConstructor {

    int pierwszePole;
    int drugiePole;

    ClassConstructor() {
        System.out.println("Jestem w tym konstruktorze");
        pierwszePole = 123;
        drugiePole = 321;
    }

    ClassConstructor(int wartoscPierwsza) {
        pierwszePole = wartoscPierwsza;
        drugiePole = 1000;
    }

    ClassConstructor(int pierwszaWartosc, int drugaWartosc) {
        System.out.println("Jestem w konstruktorze z dwoma wartosciam.");
        pierwszePole = pierwszaWartosc;
        drugiePole = drugaWartosc;
    }

}
