package OrderHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Semisi Rigby
 * Main class for running the execution of the OrderHandling Package. Tests the functionality
 * of using a menu for calling the OrderQueue, Orders, MergeSortOrders, and Display classes.
 */

public class Main {

    // method for displaying the menu
    public static void displayMenu() {

        System.out.println("\nMenu: ");
        System.out.println("Select an option below: ");
        System.out.println("--------------------");
        System.out.println("1. Add an Order to the Queue.");
        System.out.println("2. Remove an Order from the Queue.");
        System.out.println("3. Display current orders.");
        System.out.println("0. Exit.");
        System.out.println("--------------------");

    }

    // driver (main method)
    public static void main(String[] args) {

        // create instances of the classes to be used
        OrderQueue orderQueue = new OrderQueue();
        Display display = new Display();
        // create a Scanner instance to accept input for the menu
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Order Handling System");
        System.out.println("--------------------");

        // while loop to iterate multiple interactions
        while (true) {
            // display the menu to the user
            displayMenu();

            System.out.println("Option Selection: ");

            // try/catch block to catch input exception from the user to scanner instance
            try {
                // store user input
                int input = sc.nextInt();

                // switch case structure to handle option
                switch (input) {

                    case 1:
                        // follow prompts to enter info
                        System.out.println("Enter Name for the new order: ");
                        String lastName = sc.next().toUpperCase(); // prevent case-sensitive sorting

                        System.out.println("Enter the Order Number: ");
                        int orderNum = sc.nextInt();

                        System.out.println("Enter the Cost of the Order: ");
                        double totalCost = sc.nextDouble();


                        if (!orderQueue.addOrder(lastName, orderNum, totalCost)) {
                            System.out.println("Adding of the Order was cancelled.");
                        }
                        else {
                            System.out.println("Order was successfully added!");
                        }
                        display.updateDisplay(orderQueue.getOrderQueue());

                        break;
                    case 2:
                        // remove top order and update the display
                        // removeOrder() will return an empty message if orderQueue is empty
                        orderQueue.removeOrder();
                        display.updateDisplay(orderQueue.getOrderQueue());
                        break;
                    case 3:
                        // display the current order lists (sorted from Display Class)
                        // prevent displaying an empty orderQueue
                        if (!display.getOrdersByName().isEmpty()) {
                            display.displayOrders();
                        }
                        else {
                            System.out.println("The Order Queue is currently empty.");
                        }
                        break;
                    case 0:
                        // close Scanner and exit program
                        System.exit(0);
                    default:
                        // handles invalid input to the menu
                        System.out.println("Invalid selection has been detected. Please select one " +
                                "of the options from the menu.");
                        // clear the Scanner instance

                } // end of switch case structure

            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input. Please ensure that all input is valid.");
                System.out.println("If adding an order, ensure that order number and total cost are valid digits.\n");
                sc.next();
            }

        }// end of the while loop

    } // end of main method

} // end of Main class
