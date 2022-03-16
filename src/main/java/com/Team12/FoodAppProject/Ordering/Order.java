import java.util.ArrayList;
import java.io.Serializable;

class Order implements Serializable {

	private ArrayList<Food> orderedFood;
	private short orderStatus;

	/** Default constuctor for Order class
	* Creates an empty order
	*/
	public Order() {

		orderedFood = new ArrayList<>();

		// defualt status for new order, zero
		orderStatus = 0;

	} // end of Food() default constructor

	/** Adds a food item to this this Order
	* @param addMe food item represented as a Food object to be added to the list
	* @return always true, add() method from java.util.ArrayList returns void
	*/
	public boolean addFood(Food addMe) {

		this.orderedFood.add(addMe);

		return true;

	} // end of addFood() method defintion

	/** Remove a food item from thsi order
	* @param removeMe food item to be deleted represented as a Food object
	* @return true if remove successfully, false if item not found
	*/
	public boolean removeFood(Food removeMe) {

		// seach list
		for (int i = 0; i < this.orderedFood.size(); i++) {

			// if found item
			if (compare(removeMe, this.orderedFood[i])) {

				this.orderedFood.remove(i);

				return true;

			}  // end of if found item

		} // end of while i less than ordered food size

		// else item not found
		return false;

	} // end of removeFood() method defintion

	/** Sets the total price of this order
	* <p>does not include tax as of yet
	* @return the sum of all the prices in the order
	*/
	public double getTotalPrice() {

		double sum = 0;

		// getting each price
		for (int i = 0; i < this.orderedFood.size(); i++) {

			sum = sum + this.orderedFood[i].getPrice();

		} // end of for i less than orderedFoodSize

		return sum;

	} // end of getTotalPrice() method defintion

	/** Work in progress
	* <p> Does this code return the sum of the times for all the items?
	* <p> Should this function take into accound all the orders ahead in the queue?
	*/
	public int getTimeToCook() {

		// work in progress
		return 0;

	} // end of getTimeToCook() method defintion

	/** It is beyond the scope of this function to actually move into the order queue
	* <p> This function only enumerates the short, after payment
	*/
	public void moveToStack() {

		this.orderStatus = 1;

	} // end of moveToStack() method defintion

	/** Returns the orderStatus
	* <p> 0 for pre-payment
	* <p> 1 for post-paymeny, in-queue
	* <p> 2 for in progress, being made
	* <p> 3 for order completed
	*/
	public short getStatus() {

		return this.orderStatus;

	} // end of getStatus() function definition

} // end of Order class defintion
