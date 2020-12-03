package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number Of Political Parties Allowed:");
        int limit=sc.nextInt();
        new PoliticalParties(limit);
        System.out.print("Enter Voters Limit: ");
        sc.nextLine();
        int capacity =sc.nextInt();
        new Citizen(capacity);
        sc.close();
	}
}
