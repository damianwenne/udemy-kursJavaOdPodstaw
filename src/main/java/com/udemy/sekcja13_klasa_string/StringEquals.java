package com.udemy.sekcja13_klasa_string;

public class StringEquals {
    public static void main(String[] args) {
        String stringLiteral1 = "tekst";
        String stringLiteral2 = "tekst";

        boolean porownanieStringow = stringLiteral1 == stringLiteral2;
        System.out.println("stringLiteral1 == stringLiteral2: " + porownanieStringow);

        String strObject1 = new String("tekst");
        String strObject2 = new String("tekst");
        porownanieStringow = strObject1 == strObject2;
        System.out.println("strObject1 == strObject2: " + porownanieStringow);

        porownanieStringow = stringLiteral1.equals(stringLiteral2);
        System.out.println("stringLiteral1.equals(stringLiteral2): " + porownanieStringow);

        porownanieStringow = strObject1.equals(stringLiteral2);
        System.out.println("strObject1.equals(stringLiteral2): " + porownanieStringow);
    }
}
