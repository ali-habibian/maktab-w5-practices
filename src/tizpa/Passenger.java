package tizpa;

import java.util.Scanner;

public class Passenger {
    private final City city = new City();
    private final Taxi taxi = new Taxi(city);

    public void trip(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x coordinate you want to trip: ");
        int cityMapRow = input.nextInt();

        System.out.println("Enter y coordinate you want to trip: ");
        int cityMapCol = input.nextInt();

        System.out.println("Enter number of trip method that you want: ");
        System.out.println("1- Economic \n2- Special \nLeague ERD3- Motorcycle");
        int tripMethod = input.nextInt() - 1;

        System.out.println("Enter number of condition: ");
        System.out.println("1- Rainfall and peak hours of traffic" +
                " \n2- Peak hours of traffic ratio" +
                " \n3- Rainfall");
        int tripCondition = input.nextInt();

        double tripCost = taxi.tripCost(tripMethod, tripCondition, cityMapRow, cityMapCol);

        System.out.println("Your trip cost is: " + tripCost);
    }
}
