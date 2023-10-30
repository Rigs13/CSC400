package OrderHandling;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Semisi Rigby
 * This class will use a queue to hold the orders sorted by when they were
 * recieved. Class will contain customer last name, order number, and total cost
 */
public class OrderQueue {

    // create a Queue that uses a LinkedList implementation for storing data separate from pointers
    // current default capacity of 20; LinkedList default size
    private final Queue<Order> orderQueue = new LinkedList<>();

    /**
     * Method used to add orders to the orderQueue
     * @param customerLastName  String input for the last name of the order
     * @param orderNumber       int input for the order number of the order
     * @param totalCost         double input for the cost of the order
     * @return boolean          true if added successfully, false if not
     */
    public boolean addOrder(String customerLastName, int orderNumber, double totalCost) {
        boolean result = true;
        try {
            Order order = new Order(customerLastName, orderNumber, totalCost);
            orderQueue.add(order);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input detected. Please check that appropriate "
                    + "information is added.");
            result = false;
        }
        return result;
    }

    /**
     * Method for removing an order from the order queue, uses poll method of the Queue class.
     * The poll method returns the first order in the queue; would return null if empty
     */
    public void removeOrder() {

        // if orderQueue is empty, handle
        if (!orderQueue.isEmpty()) {
            orderQueue.poll();
        }
        else {
            System.out.println("The Order Queue is currently empty.");
        }

    }

    /**
     * Method for returning the orderQueue
     * @return  orderQueue instance
     */
    public Queue<Order> getOrderQueue() {

        return orderQueue;

    }


} // end of OrderQueue class
