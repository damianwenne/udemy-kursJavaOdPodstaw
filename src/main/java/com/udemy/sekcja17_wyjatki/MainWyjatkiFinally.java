package com.udemy.sekcja17_wyjatki;

public class MainWyjatkiFinally {

    static String str = "String tekstowy";
    public static void main(String[] args) {


        try {
            System.out.println("WSZYSTKO WIELKA LITERA: " + str.toUpperCase());
            System.out.println("Zanka na miejscu 100: " + str.charAt(100));
        }
//        catch (NullPointerException e) {
//            System.out.println("Poszedl NULL");
//        } catch (StringIndexOutOfBoundsException f) {
//            System.out.println("Poszedl poza zakres");
//        }
        finally {
            System.out.println("Ja i tak zawsze sie wykonam");
        }
    }
}
