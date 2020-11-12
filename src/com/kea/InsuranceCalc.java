package com.kea;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class InsuranceCalc {
    InsuranceData insuranceData = new InsuranceData();
    ArrayList<Integer> price = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);





    public void setPrice() {
        price.add(insuranceData.getIndboGrundPakke());
        while (true) {
            System.out.println("Ønsker du dækning af skade på elektronik? Y/N");
            String elektronik = scanner.nextLine();

            if (elektronik.equalsIgnoreCase("Y")) {
                System.out.println("Dæknig af elektronik tilvalgt.");
                price.add(insuranceData.getElektronik());
                break;
            }
            if (elektronik.equalsIgnoreCase("N")) {
                System.out.println("Dækning af elektronik fravalgt.");
                break;
            }
            System.out.println("Valg ikke genkendt, prøv venligst igen.\n");
        }
        System.out.println();

        while (true) {
            System.out.println("Ønsker du dækning af skade på briller? Y/N");
            String briller = scanner.nextLine();

            if (briller.equalsIgnoreCase("Y")) {
                System.out.println("Dæknig af briller tilvalgt.");
                price.add(insuranceData.getBriller());
                break;
            }
            if (briller.equalsIgnoreCase("N")) {
                System.out.println("Dækning af briller fravalgt.");
                break;
            }
            System.out.println("Valg ikke genkendt, prøv venligst igen.\n");
        }
        System.out.println();

        while (true) {
            System.out.println("Ønsker du dækning af tandskader? Y/N");
            String tandskader = scanner.nextLine();

            if (tandskader.equalsIgnoreCase("Y")) {
                System.out.println("Dæknig af tandskader tilvalgt.");
                price.add(insuranceData.getTandskader());
                break;
            }
            if (tandskader.equalsIgnoreCase("N")) {
                System.out.println("Dækning af tandskader fravalgt.");
                break;
            }
            System.out.println("Valg ikke genkendt, prøv venligst igen.\n");
        }
        System.out.println();

        while (true) {
            System.out.println("Ønsker du dæning af skader ved ekstremsport? Y/N");
            String cykelErstatning = scanner.nextLine();

            if (cykelErstatning.equalsIgnoreCase("Y")) {
                System.out.println("Dæknig af skader ved ekstremsport tilvalgt.");
                price.add(insuranceData.getEkstremSport());
                break;
            }
            if (cykelErstatning.equalsIgnoreCase("N")) {
                System.out.println("Dækning af skader ved ekstremsport fravalgt.");
                break;
            }
            System.out.println("Valg ikke genkendt, prøv venligst igen.\n");
        }
        System.out.println();

        while (true) {
            System.out.println("Ønsker du cykelerstatning ved tyveri? Y/N");
            String cykelErstatning = scanner.nextLine();

            if (cykelErstatning.equalsIgnoreCase("Y")) {
                System.out.println("Dæknig af cykeltyveri tilvalgt.");
                price.add(insuranceData.getCykelErstatning());
                break;
            }
            if (cykelErstatning.equalsIgnoreCase("N")) {
                System.out.println("Dækning af cykeltyveri fravalgt.");
                break;
            }
            System.out.println("Valg ikke genkendt, prøv venligst igen.\n");
        }
        System.out.println();
    }
}