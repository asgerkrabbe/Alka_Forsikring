package com.kea;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class MenuSelection {
    Scanner scanner = new Scanner(System.in);
    Job job = new Job();
    InsuranceCalc insuranceCalc = new InsuranceCalc();

    public void menuSelection() {
        System.out.println("\n*** VELKOMMEN TIL KRABBE INSURANCE INC. ***\n");

        job.job();

        System.out.print("\nVælg ehverv fra listen: ");
        String menuValg = scanner.nextLine();
        System.out.println();

        if (menuValg.contains("1")) {
            System.out.println("Brandmand valgt.");
        }
        if (menuValg.contains("2")) {
            System.out.println("Buschauffør valgt.");
        }
        if (menuValg.contains("3")) {
            System.out.println("Drifstleder valgt.");
        }
        if (menuValg.contains("4")) {
            System.out.println("Frisør valgt.");
        }
        if (menuValg.contains("5")) {
            System.out.println("Læge valgt.");
        }
        if (menuValg.contains("6")){
            System.out.println("Lærer valgt.");
        }
        if (menuValg.contains("7")) {
            System.out.println("Pilots valgt.");
        }
        if (menuValg.contains("8")) {
            System.out.println("Sosu-Assistent valgt.");
        }
        if (menuValg.contains("9")) {
            System.out.println("Studerende valgt.");
        }

        System.out.println();

        insuranceCalc.setPrice();

        double sum = 0;
        for (int i = 0; i < insuranceCalc.price.size(); i++) {
            sum += insuranceCalc.price.get(i);
        }

        if (menuValg.contains("1")) {
            System.out.print(job.getBrandmand() * sum);
        }
        if (menuValg.contains("2")) {
            System.out.print(job.getBuschauffor() * sum);
        }
        if (menuValg.contains("3")) {
            System.out.print(job.getDriftsleder() * sum);
        }
        if (menuValg.contains("4")) {
            System.out.print(job.getFrisor() * sum);
        }
        if (menuValg.contains("5")) {
            System.out.print(job.getLaege() * sum);
        }
        if (menuValg.contains("6")) {
            System.out.print(job.getUnderviser()*sum);
        }
        if (menuValg.contains("7")) {
            System.out.print(job.getPilot() * sum);
        }
        if (menuValg.contains("8")) {
            System.out.print(job.getSosuAssistent() * sum);
        }
        if (menuValg.contains("9")) {
            System.out.print(job.getStuderende() * sum);
        }
        System.out.println(",- årligt");
        System.out.println("\n\tTak for at handle med:\n ***KRABBE INSURANCE INC. ***");
    }
}