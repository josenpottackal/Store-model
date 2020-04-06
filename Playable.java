
/**
* File Name: Playable.java
* Purpose: Class that implements products that can be playable
* Date: 2020-02-07
* Last modified: 2020-02-07
* Author: Josen Pottackal
* Copy right no copyright
* Version: 1.0
*/

public abstract class Playable extends Product {
	
	protected double price;
	protected int numStock;
	protected double runtime;
	protected String title;
	
	public Playable(double price, int numStock, double runtime, String title) {
		super (price, numStock);
		this.runtime = runtime;
		this.title = title;
		
	}

	/**
	 * Get the runtime of the product.
	 * @return The runtime of the product in minutes.
	 */
	public double getRuntime() {
		return runtime;
	}
	
	/**
	 * Set the runtime of the product in minutes.
	 * @param runTime The runtime of the product in minutes.
	 */
	public void setRuntime(double runtime) {
		this.runtime = runtime;
	}
	
	/**
	 * Get the title of the product.
	 * @return The title of the product.
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Set the title of the product.
	 * @param title The title of the product.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

       /**
        * Plays the playable media.  We really don't know what
        * to do here because media is not specified.
        */
    public abstract void play();
    
    public double getRentalCost() {
		return 1.00;
	}
}
