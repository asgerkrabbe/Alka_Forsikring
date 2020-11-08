package com.kea;

import java.util.Scanner;

public class MenuSelection {

    public void menuSelection() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vælg ehverv\n");
        Job job = new Job();
        job.job();
        int menu = scanner.nextInt();

        switch (menu) {
            case 1: {
                System.out.println("Buschauffør valgt.");
            }
            case 2: {
                System.out.println("Drifstleder valgt.");
            }
            case 3: {
                System.out.println("Frisør valgt.");
            }
            case 4: {
                System.out.println("Læge valgt.");
            }
            case 5: {
                System.out.println("Pilots valgt.");
            }
            case 6: {
                System.out.println("Politimand valgt.");
            }
            case 7: {
                System.out.println("Sosu-Assistent valgt.");
            }
            case 8: {
                System.out.println("Studerende valgt.");
            }
            case 9: {
                System.out.println("Sygeplejerske valgt.");
            }
        }
    }
}