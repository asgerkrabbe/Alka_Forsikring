package com.kea;

public class Job {

    public double getBrandmand() {
        return brandmand;
    }

    public double getBuschauffor() {
        return buschauffor;
    }

    public double getDriftsleder() {
        return driftsleder;
    }

    public double getFrisor() {
        return frisor;
    }

    public double getLaege() {
        return laege;
    }

    public double getPilot() {
        return pilot;
    }

    public double getSosuAssistent() {
        return sosuAssistent;
    }

    public double getStuderende() {
        return studerende;
    }

    public double getUnderviser() {
        return underviser;
    }

    private double brandmand = 0.95;
    private double buschauffor = 0.93;
    private double driftsleder = 1;
    private double frisor = 0.98;
    private double laege = 1;
    private double underviser = 0.96;
    private double pilot = 1;
    private double sosuAssistent = 0.90;
    private double studerende = 0.80;

    public final String[] jobs = {"Brandmand", "Buschauffør", "Driftsleder", "Frisør", "Læge", "Lærer", "Pilot", "Sosu-Assistent", "Studerende"};
    }
