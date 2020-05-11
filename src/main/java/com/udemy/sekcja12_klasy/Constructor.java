package com.udemy.sekcja12_klasy;

public class Constructor {
    public static void main(String[] args) {

        ClassConstructor klasaKonstruktor = new ClassConstructor(105, 1254);

        System.out.println(klasaKonstruktor.pierwszePole);
        System.out.println(klasaKonstruktor.drugiePole);

        ClassTwo klasaDwa = new ClassTwo();

        ClassConstructor klasaKon = new ClassConstructor();
        System.out.println(klasaKon.pierwszePole);
        System.out.println(klasaKon.drugiePole);



    }
}
