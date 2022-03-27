package main;

import java.io.*;
import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        boolean quit = false;

        System.out.println(" Welcome to the SOWISO system!\n");
        Scanner userInput = new Scanner(System.in);//read user specified file txt

        do {
            printMenu();

            int option = userInput.nextInt(); // Get a number from the user

            if (option == 1) {
                sum();
                System.out.println("\n");
            }

            if (option == 3) {
                quit = true;
                System.out.println("Thank you for using our System!\n Have a nice day!");
            }

        } while (!quit);
    }

    /**
     * Prints the menu in a user friendly way
     */
    private static void printMenu() {
        System.out.println("Please make your choice:");
        System.out.println("   1 - Give me to calculate the sum of 2 random inputs. ");
        System.out.println("   3 - Stop the program ");

    }


    /**
     * a method that asks the user to input the value of the sum
     */
    private static synchronized void sum() {
        boolean correct = false;
        System.out.println("You will now see the operation you should calculate.\n");
        scanner.useDelimiter("\n");

        Random rand = new Random(); //instance of random class

        //we can always adapt the problem to have a larger intereval, to accept doubles etc
        int upperbound = 1000000000;
        int a = rand.nextInt(upperbound);
        int b = rand.nextInt(upperbound);
        int c = a + b;
        System.out.println("Please calculate \n" + a + " + " + b);

        System.out.println("What is the value? Please write the result\n");
        //if the user gives an input that is not of type double/int etc the programme will give an error and will have to be restarted
        int value = scanner.nextInt();
        if (c == value) {
            correct = true;
        }
        System.out.println("So, let me check. Your solution is...\n" + correct);

        if (!correct) {
            System.out.println("Incorrect. Ups.\n");

            System.out.println("Try better next time");

        }
        if (correct) {
            System.out.println("Correct. Well done!");

        }
    }

}