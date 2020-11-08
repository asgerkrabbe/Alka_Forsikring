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

    public double getPolitimand() {
        return politimand;
    }

    public double getSosuAssistent() {
        return sosuAssistent;
    }

    public double getStuderende() {
        return studerende;
    }

    public double getSygeplejerske() {
        return sygeplejerske;
    }

    private double brandmand = 0.95;
    private double buschauffor = 0.93;
    private double driftsleder = 1;
    private double frisor = 0.98;
    private double laege = 1;
    private double pilot = 1;
    private double politimand = 0.95;
    private double sosuAssistent = 0.90;
    private double studerende = 0.80;
    private double sygeplejerske = 0.89;

    private final String[] jobs = {"Brandmand", "Buschauffør", "Driftsleder", "Frisør", "Læge", "Pilot", "Politimand", "Sosu-Assistent", "Studerende", "Sygeplejerske"};

    public void job() {
        Job job = new Job();
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ". " + job.jobs[i]);
        }
    }
}