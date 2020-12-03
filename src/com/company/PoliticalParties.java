package com.company;

import java.util.Scanner;

public class PoliticalParties {


    public  PoliticalParties(int limit) {
        Scanner scanner = new Scanner(System.in);
        String[] partyName=new String[limit];
        String[] candidateName=new String[limit];
        for (int i=0;i<limit;i++) {
            System.out.print("Enter Party Name:");
            partyName[i] = scanner.nextLine();
            System.out.print("Enter Candidate Name:");
            candidateName[i]=scanner.nextLine();
        }
        for (int i=0;i<limit;i++) {
            System.out.println(i+":-"+partyName[i]+":"+candidateName[i]);
        }
        scanner.close();
    }
}


