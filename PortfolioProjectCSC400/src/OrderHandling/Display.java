package OrderHandling;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Semisi Rigby
 * Class used to display the OrderQueue and to handle the sorting of the Queue
 * by name and order number. Methods will display and update the displayed Queues
 * to the menu implementations. The viewed queues that are sorted are stored in a List
 * implementation to allow for the use of duplicates as necessary since customer's
 * names may be the same; however, additional insight into separation of unique
 * order numbers should be investigated further.
 */
public class Display {

    // create new lists to store the sorted queue of orders
    private List<Order> ordersByName = new LinkedList<>();
    private List<Order> ordersByNumber = new LinkedList<>();
    // create an instance of the MergeSortOrders class
    private final MergeSortOrders<Order> mergeSort = new MergeSortOrders<>();
    // create an instance of the OrderComparator class
    private final OrderComparator comparator = new OrderComparator();

    /**
     * Method used to automatically update the displayed lists from the orderQueue
     * while implementing custom sorting
     * @param orderQueue    the orderQueue to be updated
     */
    public void updateDisplay(Queue<Order> orderQueue) {

        ordersByName = new LinkedList<>(orderQueue);
        ordersByNumber = new LinkedList<>(orderQueue);

        // call the custom mergeSort method from the mergeSort instance with the comparator instance
        mergeSort.mergeSort(ordersByName, comparator::compareByLastName);
        mergeSort.mergeSort(ordersByNumber, comparator::compareByOrderNum);

    } // end of updateDisplay method

    /**
     * Method for displaying the sorted lists derived from the orderQueue
     */
    public void displayOrders() {

        // display the current number of Orders within the orderQueue
        System.out.println("Current number of Orders: " + ordersByName.size());


        // display the list ordered by last name
        System.out.println("\nOrders by Customer's Last Name: ");
        for (Order order : ordersByName) {
            System.out.println(order.getCustomerLastName() + ", Order Number: " + order.getOrderNumber() +
                    ", Total Cost: " + order.getTotalCost());
        }

        // display the list ordered by number
        System.out.println("\nOrders by Order Number: ");
        for (Order order : ordersByNumber) {
            System.out.println(order.getOrderNumber() + ", Customer Name: " + order.getCustomerLastName() +
                    ", Total Cost: " + order.getTotalCost());
        }

    } // end of displayOrders method

    /**
     * Method for returning the ordersByName for use by other classes.
     * @return  returns list of ordersByName
     */
    public List<Order> getOrdersByName() {

        return ordersByName;

    }

} // end of class
