package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
public class Main {

    public static void main(String[] args) {
        //objects

        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);

        String name;
        int j;
        BankAccount ba []= new BankAccount[5];

        for(j =0; j < ba.length; j++){
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. ");
            name = kbReader.nextLine( );

            System.out.print("Please enter the amount of the deposit. ");
            double amount = kbReader.nextDouble( );
            System.out.println(" ");
        }
        ba[j] = new BankAccount(name, account);
        Comparable comp = new BA_comparable();
        Arrays.sort(ba, comp);

        for (j = 0; j<ba.length)
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. ");
            name = kbReader.nextLine();

            System.out.print("Please enter the amount of the deposit. ");
            double amount = kbReader.nextDouble();
            System.out.println("");

            ba[j] = new BankAccount(name, amount);
        }
        Comparator comp = new BA_Comparator(); //not needed for first two projects
        Arrays.sort(ba, comp); //Arrays.sort(ba); for first two projects
        for(int i = 0; i < ba.length; i++)
        {
            System.out.println(ba[i].name + ">>>" + ba[i].balance);
        }

    }
}
