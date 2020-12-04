package com.company;

import java.util.Scanner;

public class PoliticalParties {

    public PoliticalParties(int limit) {
        Scanner scanner = new Scanner(System.in);
        String[] partyName = new String[limit];
        String[] candidateName = new String[limit];

        for (int i = 0; i < limit; i++) {
            System.out.println("Iteration - " + (i + 1));
            System.out.print("\tEnter party Name: ");
            partyName[i] = scanner.nextLine();

            System.out.print("\tEnter candidate Name: ");
            candidateName[i] = scanner.nextLine();
        }

        System.out.println("Parties:-");
        for (int i = 0; i < limit; i++) {
            System.out.println("\t" + i + " - Party name: " + partyName[i]
                    + ", Candidate name: " + candidateName[i]);
        }
    }
}


