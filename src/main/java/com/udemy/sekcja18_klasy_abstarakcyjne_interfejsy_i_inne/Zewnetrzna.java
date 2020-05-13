package com.udemy.sekcja18_klasy_abstarakcyjne_interfejsy_i_inne;

public class Zewnetrzna {
    int poleZewnetrzne;

    int metodaZewnetrzna() {
        Wewnetrzna wewnetrzna = new Wewnetrzna();
        wewnetrzna.poleWewnetrzne = 202;
        wewnetrzna.metodaWewnetrzna();
        return -1;
    }

    class Wewnetrzna {
        int poleWewnetrzne;

        int metodaWewnetrzna() {
            metodaZewnetrzna();
            poleZewnetrzne = 101;
            return -2;
        }
    }
}
