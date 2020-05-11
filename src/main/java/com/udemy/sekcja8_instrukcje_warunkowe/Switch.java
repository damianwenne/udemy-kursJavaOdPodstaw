package com.udemy.sekcja8_instrukcje_warunkowe;

public class Switch {
    public static void main(String[] args) {

        int zmienna = 5;
        switch (zmienna) {
            case 1:
                System.out.println("Jeden");
                break;
            case 2:
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Trzy");
                break;
            default:
                System.out.println("Nie spelniono zadnego przypadku");
                break;
        }

        char pojedynczyZnak = 'B';
        switch (pojedynczyZnak) {
            case 'a':
                System.out.println("Podales male a");
                break;
            case 'A':
                System.out.println("Podales duze A");
                break;
            default:
                System.out.println("Nie rozpoznano znaku");
                break;
        }

        System.out.println("Bedzie wykonywany if");
        switch (zmienna) {
            case 1:
                System.out.println("jeden");
                break;
            case 2:
                System.out.println("dwa");
                break;
            case 3:
                System.out.println("trzy");
                break;
            case 5:
                System.out.println("piec");
                break;
            default:
                System.out.println("Nie znam tej liczby");
                break;
        }

        System.out.println("Kalendarz:");
        int miesiac = 5;
        switch (miesiac) {
            case 1:
                System.out.println("Styczen");

            case 2:
                System.out.println("Luty");

            case 3:
                System.out.println("Marzec");

            case 4:
                System.out.println("Kwiecien");

            case 5:
                System.out.println("Maj");

            case 6:
                System.out.println("Czerwiec");

            case 7:
                System.out.println("Lipiec");

            case 8:
                System.out.println("Sierpien");

            case 9:
                System.out.println("Wrzesien");

            case 10:
                System.out.println("Pazdziernik");

            case 11:
                System.out.println("Listopad");

            case 12:
                System.out.println("Grudzien");

        }

    }
}
