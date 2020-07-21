package com.crystomatic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double order = 0;

        try {

            //getting user inputs
            System.out.print("Please Enter the weight of rice needed: ");
            order = sc.nextDouble();
            //validating values
            String decimalValue = String.valueOf(order);
            decimalValue = decimalValue.substring(decimalValue.indexOf("."));
            if ((decimalValue.equals(".5") || decimalValue.equals(".0")) && order>0) {
                //initializing bag count variables
                int fourKG = 0;
                int twoKG = 0;
                int oneKG = 0;


                //calculating the number of bags
                // 4 kg bag count
                while (order >= 4) {
                    order = order - 4;
                    fourKG++;

                }

                // 2 kg bag count
                while (order >= 2) {
                    twoKG++;
                    order = order - 2;

                }

                // 1 kg bag count
                while (order >= 0.5) {
                    order--;
                    oneKG++;
                }

                //displaying the bag count.
                System.out.println("Number of bags needed:");
                System.out.println(fourKG + " of 4 KG bags.");
                System.out.println(twoKG + " of 2 KG bags.");
                System.out.println(oneKG + " of 1 KG bags.");

            } else {
                System.out.println("Order rejected! ");
            }

        } catch (InputMismatchException e) {

            System.out.print("Please Enter correct the weight of rice needed: ");

        }

    }
}
