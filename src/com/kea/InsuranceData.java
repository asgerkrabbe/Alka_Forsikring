package com.kea;

class InsuranceData {

    public int getIndboGrundPakke() {
        return indboGrundPakke;
    }

    public int getElektronik() {
        return elektronik;
    }

    public int getBriller() {
        return briller;
    }

    public int getEkstremSport() {
        return ekstremSport;
    }

    public int getTandskader() {
        return tandskader;
    }

    public int getCykelErstatning() {
        return cykelErstatning;
    }

    private int indboGrundPakke = 1000;
    private int elektronik = 150;
    private int briller = 150;
    private int ekstremSport = 100;
    private int tandskader = 100;
    private int cykelErstatning = 50;
}