package com.udemy.sekcja15_klasy_kontynuacja;

public class StaticFinal {
    public static void main(String[] args) {

        ClassStaticFinal obiekt = new ClassStaticFinal();
        obiekt.pole = 10;

        // static pole i metoda
        ClassStaticFinal.poleStatic = 15;
        obiekt.poleStatic = 123;
        System.out.println("ClassStaticFinal.poleStatic: " + ClassStaticFinal.poleStatic);

        ClassStaticFinal.metodaStatyczna();

        // final
        System.out.println("Pole final: " + obiekt.poleFinal);

        // static final
        System.out.println("ClassStaticFinal.JAKIS_TEKST: " + ClassStaticFinal.JAKIS_TEKST);

    }
}
