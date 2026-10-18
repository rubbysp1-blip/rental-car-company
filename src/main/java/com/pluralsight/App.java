package com.pluralsight;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        double additionalCost = 0;
        double underageSubcharge = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("What date will you pick up the vehicle? ");
        String pickupDate = input.nextLine();

        System.out.print("How many days are you renting the car? ");
        int daysRenting = input.nextInt();

        System.out.print("Do you what to add electronic toll tag (1.Yes/2.No)? ");
        int electricTollTag = input.nextInt();
        String newLine = input.nextLine();
        System.out.print(newLine);

        System.out.print("Do you want GPS (1.Yes/2.No)? ");
        int decisionGPS = input.nextInt();

        System.out.print("Do you want roadside assistance (1.Yes/2.No)? ");
        int roadsideAssist = input.nextInt();

        System.out.print("How old are you right now? ");
        int userAge = input.nextInt();

        double basicCarRental = daysRenting * 29.99;
        double tollTagCharge = daysRenting * 3.95;
        double roadsideCharge = daysRenting * 3.95;
        double gpsCharge = daysRenting * 2.95;

        if (electricTollTag == 1) {
            additionalCost += tollTagCharge;
        }

        if (roadsideAssist == 1) {
            additionalCost += roadsideCharge;
        }

        if (decisionGPS == 1) {
            additionalCost += gpsCharge;
        }

        if (userAge < 25){
            underageSubcharge = basicCarRental * (1 - .30);
        }

        double totalCost = basicCarRental + additionalCost + underageSubcharge;

        System.out.print("\nBasic Rental: " + basicCarRental + "\n" +
                "Additional Cost: " + additionalCost + "\n"
                + "Underage Sub-charge (30%): " + underageSubcharge + "\n"
                + "---------------------------\n"
                + "Total Cost: " + totalCost);
    }
}
