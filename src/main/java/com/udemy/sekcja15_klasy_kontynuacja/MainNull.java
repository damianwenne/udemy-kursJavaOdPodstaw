package com.udemy.sekcja15_klasy_kontynuacja;



public class MainNull {
    static String str = "cos";
    static ClassForNullTest obiekt = new ClassForNullTest();

    public static void main(String[] args) {

        if (str == null) {
            System.out.println("Str jest nullem");
        }

        obiekt.metoda();
    }
}
