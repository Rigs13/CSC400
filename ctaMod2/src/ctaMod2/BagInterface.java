package ctaMod2;

/**
 * An interface to describe the operations of a bag object.
 * @author Semisi Rigby.
 */

public interface BagInterface<T> {
	
	/**
	 * Gets the current number of objects/values contained within the bag.
	 * @return	integer of the number of objects/values currently within the bag.
	 */
	public int getCurrentSize();
	
	/**
	 * Determine if the bag is empty
	 * @return boolean	True if empty, false if not empty.
	 */
	public boolean isEmpty();
	
	/**
	 * Add an object/value to the bag
	 * @param newEntry	The object/value to be added to the bag.
	 * @return boolean	True if successful, false if unsuccessful
	 */
	public boolean add(T newEntry);
	
	/**
	 * Clear the contents from the bag
	 */
	public void clear();
	
	/**
	 * Remove an unspecified object/value from the bag.
	 * @return T	Either the removed item if successful, or null
	 */
	public T remove();
	
	/**
	 * Remove a specific object/value from the bag
	 * @param T entry	 The object/value to be removed
	 * @return boolean	True if successful, false if unsuccessful (Remain consistent with Collection interface)
	 */
	public boolean remove(T entry);
	
	/**
	 * Count the occurrences of a given object/value within the bag
	 * @param entry	The object/value to be counted within the bag
	 * @return int	The number of occurrences of the entry within the bag
	 */
	public int getFrequencyOf(T entry);
	
	/**
	 * Determine if an object/value is contained in the bag
	 * @param T entry	The object/value to find
	 * @return boolean	True if found, false if not found
	 */
	public boolean contains(T entry);
	
	/**
	 * Retrieves all objects/values within the bag
	 * @return T[]	New array of all contents of the current bag
	 */
	public T[] toArray();
	
} // end of BagInterface
