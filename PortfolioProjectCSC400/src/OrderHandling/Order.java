package OrderHandling;

/**
 * @author Semisi Rigby
 * Class to create order objects to associate order information, such as
 * customer name, order number, cost, etc. Can be edited to handle additional
 * order information as needed by implementation of this Class.
 */
public class Order {

    // attributes of the order
    private final String customerLastName;
    private final int orderNumber;
    private final double totalCost;

    /**
     * Parameterized Constructor for an Order object instance. As additional information
     * tied to an order grows, editing the implementation of this constructor will be necessary.
     * @param customerLastName  String input for the last name of the order
     * @param orderNumber       int input for the order number of the order
     * @param totalCost         double input for the cost of the order
     */
    public Order(String customerLastName, int orderNumber, double totalCost) {

        // handle invalid order number and total cost
        if (orderNumber <= 0 || totalCost <= 0) {
            throw new IllegalArgumentException();
        }

        // reference params to object instance
        this.customerLastName = customerLastName;
        this.orderNumber = orderNumber;
        this.totalCost = totalCost;

    }

    /**
     * Method for retrieving the last name associated with an order instance
     * @return  last name associated with the order instance
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Method for retrieving the order number associated with an order instance
     * @return  int order number associated with the order instance
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * Method for retrieving the total cost associated with an order instance
     * @return  double total cost associated with the order instance
     */
    public double getTotalCost() {
        return totalCost;
    }

} // end of Order class
