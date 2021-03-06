package us.plee19;

import java.util.Scanner;

/**
 * Main driver class to demonstrate ParkingApp, as the main menu before selecting the check-in/check-out machine.
 * @author plee19
 * @version 1
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);
    static boolean isValidOption = false;
    static CheckInATM checkIn = new CheckInATM();
    static CheckOutATM checkOut = new CheckOutATM();

    public static void main(String[] args) {
        checkOut.loadExistingTickets();
        while (!CheckInATM.isClosed){
            System.out.print("Best Value Parking Garage\n\n=========================\n\n1 - Check/In\n2 - Check/Out\n\n=>");
            while (!isValidOption) {
                switch(keyboard.nextInt()) {
                    case 1:
                        checkIn.displayStartScreen();
                        isValidOption = true;
                        break;
                    case 2:
                        isValidOption = true;
                        checkOut.displayStartScreen();
                        break;
                    default:
                        System.out.println("Please select a valid option.");
                }
            }
            isValidOption = false;
        }
    }
}