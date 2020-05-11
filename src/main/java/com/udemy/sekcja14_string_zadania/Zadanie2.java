package com.udemy.sekcja14_string_zadania;

/*
2. Dla zdania "Potrafię coraz więcej z programowania." wypisz każdy znak w osobnej linii, czyli:
P
o
t
r
a
f
i
ę

c
o
r
a
z
... itd. ;)
 */

public class Zadanie2 {
    public static void main(String[] args) {

        String stringDoPodzielenia = "Potrafie coraz wiecej z programowania";
        char[] zbiorCharow = stringDoPodzielenia.toCharArray();
        for (int i=0; i<zbiorCharow.length; i++) {
            System.out.println(zbiorCharow[i]);
        }
    }
}
