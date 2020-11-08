package com.kea;

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
            if (elektronik.contains("Y")) {
                System.out.println("Dæknig af elektronik tilvalgt.");
                price.add(insuranceData.getElektronik());
                break;
            }
            if (elektronik.contains("N")) {
                System.out.println("Dækning af elektronik fravalgt.");
                break;
            }
            System.out.println("Valg ikke genkendt, prøv venligst igen.");
        }

        while (true) {
            System.out.println("Ønsker du dækning af skade på briller? Y/N");
            String briller = scanner.nextLine();

            if (briller.contains("Y")) {
                System.out.println("Dæknig af briller tilvalgt.");
                price.add(insuranceData.getBriller());
                break;
            }
            if (briller.contains("N")) {
                System.out.println("Dækning af briller fravalgt.");
            }
            System.out.println("Valg ikke genkendt, prøv venligst igen.");
        }

        while (true) {
            System.out.println("Ønsker du dækning af tandskader? Y/N");
            String tandskader = scanner.nextLine();

            if (tandskader.contains("Y")) {
                System.out.println("Dæknig af tandskader tilvalgt.");
                price.add(insuranceData.getTandskader());
                break;
            }
            if (tandskader.contains("N")) {
                System.out.println("Dækning af tandskader fravalgt.");
            }
            System.out.println("Valg ikke genkendt, prøv venligst igen.");
        }

        while (true) {
            System.out.println("Ønsker du dæning af skader ved ekstremsport? Y/N");
            String cykelErstatning = scanner.nextLine();

            if (cykelErstatning.contains("Y")) {
                System.out.println("Dæknig af skader ved ekstremsport tilvalgt.");
                price.add(insuranceData.getEkstremSport());
                break;
            }
            if (cykelErstatning.contains("N")) {
                System.out.println("Dækning af skader ved ekstremsport fravalgt.");
            }
            System.out.println("Valg ikke genkendt, prøv venligst igen.");
        }

        while (true) {
            System.out.println("Ønsker du cykelerstatning ved tyveri? Y/N");
            String cykelErstatning = scanner.nextLine();

            if (cykelErstatning.contains("Y")) {
                System.out.println("Dæknig af cykeltyveri tilvalgt.");
                price.add(insuranceData.getCykelErstatning());
                break;
            }
            if (cykelErstatning.contains("N")) {
                System.out.println("Dækning af cykeltyveri fravalgt.");
            }
            System.out.println("Valg ikke genkendt, prøv venligst igen.");
        }
    }
}