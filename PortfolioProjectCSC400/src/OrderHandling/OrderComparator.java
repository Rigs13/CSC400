package OrderHandling;

/**
 * @author Semisi Rigby
 * Class for comparing Order attributes, namely the associated last name
 * and the order number.
 */
public class OrderComparator {

    /**
     * Method to handle the comparison logic for sorting Orders by Last Name association
     * @param order1    First order to be compared
     * @param order2    Second order to be compared
     * @return          int returned to determine comparison of Orders' last name
     */
    public int compareByLastName(Order order1, Order order2) {

        return order1.getCustomerLastName().compareTo(order2.getCustomerLastName());

    }

    /**
     * Method to handle the comparison logic for sorting Orders by Order Number association
     * @param order1    First order to be compared
     * @param order2    Second order to be compared
     * @return          int returned to determine comparison of Orders' order number
     */
    public int compareByOrderNum(Order order1, Order order2) {

        return Integer.compare(order1.getOrderNumber(), order2.getOrderNumber());

    }


}
