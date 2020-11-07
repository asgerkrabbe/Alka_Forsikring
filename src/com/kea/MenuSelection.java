package com.kea;

import java.util.Scanner;

public class MenuSelection {

    public void menuSelection() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vælg ehverv\n");
        Job job = new Job();
        job.job();
        int menu = scanner.nextInt();

        switch(menu) {
        case 1:{
            System.out.println("Buschauffør valgt.");
        }
    }
    }
}

