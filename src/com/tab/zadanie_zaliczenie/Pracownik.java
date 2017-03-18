package com.tab.zadanie_zaliczenie;

/**
 * Created by aleksandra on 18.03.2017.
 */
public class Pracownik {

        String imie;
        String nazwisko;
        String plec;
        int nr_dzialu;
        int wyplata;
        int age;
        int dzieci;
        boolean stan_cywilny;

        public Pracownik() {}


        public Pracownik(String imie, String nazwisko, String plec, int nr_dzialu, int wyplata,
                     int age, int dzieci) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.plec = plec;
            this.nr_dzialu = nr_dzialu;
            this.wyplata = wyplata;
            this.age = age;
            this.dzieci = dzieci;
        }

    }


