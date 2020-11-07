package com.kea;

public class Job {
    public String getBrandmand() {
        return brandmand;
    }

    public String getPolitimand() {
        return politimand;
    }

    public String getSosuAssistent() {
        return sosuAssistent;
    }

    public String getSygeplejerske() {
        return sygeplejerske;
    }

    public String getDriftsleder() {
        return driftsleder;
    }

    public String getBuschauffor() {
        return buschauffor;
    }

    public String getPilot() {
        return pilot;
    }

    public String getFrisor() {
        return frisor;
    }

    public String getLaege() {
        return laege;
    }

    private String brandmand;
    private String buschauffor;
    private String driftsleder;
    private String frisor;
    private String laege;
    private String pilot;
    private String politimand;
    private String sosuAssistent;
    private String sygeplejerske;

    private final String[] jobs = {"Brandmand", "Buschauffør", "Driftsleder", "Frisør", "Læge", "Pilot", "Politimand", "Sosu-Assistent","Studerende", "Sygeplejerske"};

    public void job(){
    Job job = new Job();
        for(int i = 1;i <=9;i++) {
        System.out.println(i + ". " + job.jobs[i]);
    }
    }
}