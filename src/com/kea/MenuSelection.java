package com.kea;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuSelection {
    Scanner scanner = new Scanner(System.in);
    Job job = new Job();
    InsuranceCalc insuranceCalc = new InsuranceCalc();

    public void menuSelection() {
        job.job();
        System.out.println("Vælg ehverv\n");
        String menuValg = scanner.nextLine();

        if (menuValg.contains("1")) {
            System.out.println("Buschauffør valgt.");
        }
        if (menuValg.contains("2")) {
            System.out.println("Drifstleder valgt.");
        }
        if (menuValg.contains("3")) {
            System.out.println("Frisør valgt.");
        }
        if (menuValg.contains("4")) {
            System.out.println("Læge valgt.");
        }
        if (menuValg.contains("5")) {
            System.out.println("Pilots valgt.");
        }
        if (menuValg.contains("6")) {
            System.out.println("Politimand valgt.");
        }
        if (menuValg.contains("7")) {
            System.out.println("Sosu-Assistent valgt.");
        }
        if (menuValg.contains("8")) {
            System.out.println("Studerende valgt.");
        }
        if (menuValg.contains("9")) {
            System.out.println("Sygeplejerske valgt.");
        }
        insuranceCalc.setPrice();

        double sum = 0;
        for (int i = 0; i < insuranceCalc.price.size(); i++) {
            sum += insuranceCalc.price.get(i);
        }
        System.out.println(sum);

        if (menuValg.contains("1")) {
            job.getBuschauffor();
        }
        if (menuValg.contains("2")) {
            System.out.println("Drifstleder valgt.");
        }
        if (menuValg.contains("3")) {
            System.out.println("Frisør valgt.");
        }
        if (menuValg.contains("4")) {
            System.out.println("Læge valgt.");
        }
        if (menuValg.contains("5")) {
            System.out.println("Pilots valgt.");
        }
        if (menuValg.contains("6")) {
            System.out.println("Politimand valgt.");
        }
        if (menuValg.contains("7")) {
            System.out.println("Sosu-Assistent valgt.");
        }
        if (menuValg.contains("8")) {
            System.out.println("Studerende valgt.");
        }
        if (menuValg.contains("9")) {
            System.out.println("Sygeplejerske valgt.");
        }

    }
}
