package com.company;

import java.util.Scanner;

public class Citizen {

    public Citizen(int limit) {
        citizenProperties(limit);
    }

    public void citizenProperties(int limit) {
        Scanner scanner = new Scanner(System.in);
        String[] citizenName = new String[limit];
        final int currentYear = 2020;
        int[] id = new int[limit];

        for (int i = 0; i < limit; i++) {
            System.out.print("Enter year of birth: ");
            int birthYear = scanner.nextInt();
            int age = currentYear - birthYear;

            scanner.nextLine();
            if (age < 18) {
                System.out.println("Not Eligible For Voting");
                citizenProperties(limit);
            } else {
                System.out.print("\tEnter Name: ");
                citizenName[i] = scanner.nextLine();

                System.out.print("\tEnter id: ");
                id[i] = scanner.nextInt();
                scanner.nextLine();
            }
        }

        System.out.println("Citizens:-");
        for (int i = 0; i < limit; i++) {
            System.out.println("\t" + i + " - Name: " + citizenName[i] + ", ID: " + id[i]);
        }
    }
}
