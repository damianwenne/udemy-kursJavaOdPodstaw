package com.udemy.sekcja17_wyjatki;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;

public class MainWyjatkiCheckUncheck {
    public static void main(String[] args) {
        File file = new File("lokalizacja_pliku/plik.txt");
        // check exception
        try {
            InputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("Ciagle jest ten wyjatek");
        }
        // SQLException

        // uncheck exception
        // NullPointerException, ArrayIndexOutOfBoundsException
    }
}
