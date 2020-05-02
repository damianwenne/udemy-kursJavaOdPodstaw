package com.udemy.sekcja5_zmienne_i_operatory_zadania;

public class Zadanie3 {
    public static void main(String[] args) {

        int wiek = 29;
        float wzrost = 1.76f;
        int waga = 73;

        System.out.println("Wiek: " + wiek + " lat");
        System.out.println("Wzrost: " + wzrost + "m");
        System.out.println("Waga: " + waga + "kg");

        float bodyMassIndex = waga / (wzrost * wzrost);
        System.out.println("Moje BMI: " + bodyMassIndex);

        float wzrostKwadrat = (float) Math.pow(wzrost, 2);
        System.out.println("Moje BMI: " + (waga / wzrostKwadrat));

        int bmiInt = (int) bodyMassIndex;
        System.out.println("BMI jako int: " + bmiInt);
    }
}
