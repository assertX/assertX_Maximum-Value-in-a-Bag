package assignment_11;

import java.util.ArrayList;
import java.util.Collections;




public class Bag <E>{
	// Data fields
	private ArrayList<E> bag;
	
	// Default constructor
	public Bag() {
		bag = new ArrayList<E>(); 
	}
	
	// Methods
	/**
	 * This will check to see if the bag is empty and then return true or false
	 * @return: true if the bag is empty, false if the bag isn't empty
	 */
	public boolean isEmpty() {
		if (bag.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * This will return the total amount of items in the bag
	 * @return: returns the bag size
	 */
	public int size() {
		return bag.size();
	}
	
	/**
	 * This will add the item to the specific bag by the data type
	 * @param: item: the current item(integer, double, or string)
	 */
	public void addItem(E item) {
		bag.add(item);
	}
	
	/**
	 * This will return the max value in the desired bag.
	 * @return: Max value of the current bag.
	 */
	public E getMax() {
		
		return Collections.max(bag, null);
		
	}
	
	
		
	

}
