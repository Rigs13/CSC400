package ctaMod2;

/**
 * A class that describes items objects.
 * @author Semisi Rigby
 */

public class Item {
	
	// attributes of the Item class
	private String name;
	private double price;
	
	/**
	 * Parameterized constructor for Item class
	 * @param name: String	Name of the Item object
	 * @param price: double	Price of the Item object
	 */
	public Item(String name, double price) {
		// reference params to instance
		this.name = name;
		this.price = price;
	}
	
	/**
	 * Method for retrieving name of Item object
	 * @return String	The name of the Item object
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Method for retrieving price of Item object
	 * @return double	The price of the Item object
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Override method of toString to handle the displayed
	 * context of an item object
	 * @return string	Formatted string of item
	 */
	@Override
	public String toString() {
		return "Item name: " + name + "\nItem Price: " + price + "\n";
	}

} // end of Item class
