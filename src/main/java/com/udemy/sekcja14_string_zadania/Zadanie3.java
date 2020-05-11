package com.udemy.sekcja14_string_zadania;

/*
3. Tym razem powyższe zdanie „Potrafię coraz więcej z programowania.” napisz od tyłu „.ainawomargorp z jecęiw zaroc ęifartoP”
 */
public class Zadanie3 {
    public static void main(String[] args) {
        String stringDoPodzielenia = "Potrafie coraz wiecej z programowania.";
        for (int i=stringDoPodzielenia.length()-1; i>=0; i--) {
            System.out.print(stringDoPodzielenia.charAt(i));
        }
    }
}
