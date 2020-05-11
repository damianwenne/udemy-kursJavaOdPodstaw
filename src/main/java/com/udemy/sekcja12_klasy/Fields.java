package com.udemy.sekcja12_klasy;

public class Fields {
    public static void main(String[] args) {

        ClassWithFields obiekt = new ClassWithFields();
        obiekt.liczbaCalkowita = 15;
        System.out.println(obiekt.liczbaCalkowita);

        obiekt.zwrocWartoscPola();
        obiekt.ustawWartoscPola(101);
        obiekt.zwrocWartoscPola();

        obiekt.ustawWartoscPola(202);
        int zmienna = obiekt.zwrocWartoscPolaZMetody();
        System.out.println("Zmienna: " + zmienna);


    }
}
