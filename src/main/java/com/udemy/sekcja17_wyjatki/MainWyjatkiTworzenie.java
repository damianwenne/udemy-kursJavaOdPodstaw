package com.udemy.sekcja17_wyjatki;

public class MainWyjatkiTworzenie {
    public static void main(String[] args) {
        Uzytkownik uzytkownik = new Uzytkownik();

        try {
            uzytkownik.wprowadzEmail("jan.kowalski@przyklad.com");
            uzytkownik.wprowadzHaslo("qwerty123tajne");
            System.out.println("Wszystko poszlo OK");
        } catch (NiezbytTajneHasloException e) {
            System.out.println("Haslo niezbyt bezpieczne ...");
        } catch (NiepoprawnyEmailException e) {
            System.out.println("Email nie zawiera @");
        }



        System.out.println("Czy doszedlem tutaj?");

    }
}
