package com.company;

import java.util.Scanner;

public class Citizen{

    public Citizen(int limit){
        Scanner sc=new Scanner(System.in);
        String[] citizenName=new String[limit];
        final int currentYear=2020;
        int[] id=new int[limit];
        System.out.print("Enter Year of Birth:");
        int birthYear=sc.nextInt();
        int age=currentYear-birthYear;
        for (int i=0;i<limit;i++)
        {
            if (age>18)
            {
                System.out.print("Enter Name: ");
                citizenName[i]=sc.nextLine();
                System.out.print("Enter id: ");
                id[i]=sc.nextInt();
            }
        }
        for (int i=0;i<limit;i++)
        {
            System.out.println(i+citizenName[i]+id[i]);
        }
            sc.close();
    }
}
