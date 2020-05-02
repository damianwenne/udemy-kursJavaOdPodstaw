package com.udemy.sekcja4_operatory;

public class LogicalOperators {
    public static void main(String[] args) {

        int wiek = 20;

        // koniunkcja (AND)
        System.out.println(wiek >= 18 && wiek < 30);
        System.out.println(wiek > 30 && wiek < 40);

        // alternatywa (OR)
        System.out.println(wiek < 18 || wiek > 65);
        System.out.println(wiek <= 20 || wiek > 65);

        // negacja
        boolean prawda = true;
        System.out.println("!prawda: " + !prawda);

        boolean falsz = false;
        System.out.println("!Falsz: " + !falsz);
    }

}
