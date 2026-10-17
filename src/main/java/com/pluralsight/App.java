package com.pluralsight;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What date will you pick up the vehicle? ");
        String pickupDate = input.nextLine();
        input.nextLine();

        System.out.print("How many days are you renting the car? ");
        int daysRenting = input.nextInt();
        input.nextInt();

        System.out.print("Do you what to add electronic toll tag? ");
        boolean electricTollTag = input.nextBoolean();
        input.nextBoolean();

        System.out.print("Do you want GPS? ");
        boolean decisionGPS = input.hasNextBoolean();
        input.nextBoolean();

        System.out.print("Do you want roadside assistance? ");
        boolean roadsideAssist = input.nextBoolean();
        input.nextBoolean();

        System.out.print("How old are you right now? ");
        int userAge = input.nextInt();
        input.nextInt();




    }
}
