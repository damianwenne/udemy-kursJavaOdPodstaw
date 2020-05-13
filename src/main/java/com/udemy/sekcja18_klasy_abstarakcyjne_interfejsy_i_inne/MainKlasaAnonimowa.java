package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

import java.awt.*;

public class MainKlasaAnonimowa {
    public static void main(String[] args) {

        ZwyklaKlasa obiektKlasyAnonimowej = new ZwyklaKlasa() {
            @Override
            public void metodaZwykla() {
                System.out.println("Metoda wywolana z klasy anonimowej");
            }
        };

        obiektKlasyAnonimowej.metodaZwykla();

        metodaTutaj(new Button() {
            @Override
            public void onClick() {
                System.out.println("Nacisnalem przycisk i pokazalem cos uzytkownikowi na ekranie");
            }
        });

    }

    public static void metodaTutaj(Button button) {
        button.onClick();

    }

    static class Button {
        public void onClick() {
            System.out.println("Nacisnalem na przycisk");
        }
    }
}
