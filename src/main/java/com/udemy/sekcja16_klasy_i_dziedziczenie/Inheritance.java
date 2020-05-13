package com.udemy.sekcja16_klasy_i_dziedziczenie;

public class Inheritance {
    public static void main(String[] args) {

        BasicClass basicClass = new BasicClass();
        ExtendedClass extendedClass = new ExtendedClass();

        basicClass.metodaPierwsza();
        extendedClass.metodaPierwsza();
        extendedClass.metodaRozszerzona();

        MoreExtendedClass moreExtendedClass = new MoreExtendedClass();
        moreExtendedClass.metodaPierwsza();
        moreExtendedClass.metodaRozszerzona();

    }
}
