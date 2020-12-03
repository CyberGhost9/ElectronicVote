package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter party capacity: ");
        int partyLimit = scanner.nextInt();
        new PoliticalParties(partyLimit);

        System.out.print("Enter voters capacity: ");
        int voterLimit = scanner.nextInt();
        new Citizen(voterLimit);

        scanner.close();
    }
}
