package com.pluralsight;

import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        double additionalCost = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("What date will you pick up the vehicle? ");
        String pickupDate = input.nextLine();
        //input.nextLine();

        System.out.print("How many days are you renting the car? ");
        int daysRenting = input.nextInt();
        //input.nextInt();

        System.out.print("Do you what to add electronic toll tag (1.Yes/2.No)? ");
        int electricTollTag = input.nextInt();
        String newLine = input.nextLine();
        System.out.print(newLine);

        System.out.print("Do you want GPS (1.Yes/2.No)? ");
        int decisionGPS = input.nextInt();
        //input.nextBoolean();

        System.out.print("Do you want roadside assistance (1.Yes/2.No)? ");
        int roadsideAssist = input.nextInt();
        //input.nextBoolean();

        System.out.print("How old are you right now? ");
        int userAge = input.nextInt();
        //input.nextInt();

        double basicCarRental = daysRenting * 29.99;
        double underageSubcharge = (basicCarRental) * (1 - .30);
        double tollTagCharge = daysRenting * 3.95;
        double roadsideCharge = daysRenting * 3.95;
        double gpsCharge = daysRenting * 2.95;

        switch (electricTollTag){
            case 1 -> additionalCost += tollTagCharge;
        }

        switch (roadsideAssist){
            case 1 -> additionalCost += roadsideCharge;
        }

        switch (decisionGPS){
            case 1 -> additionalCost += gpsCharge;
        }
        System.out.println(additionalCost);
    }
}
