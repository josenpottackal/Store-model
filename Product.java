
/**
* File Name: Product.java
* Purpose: A class that models a product
* Date: 2020-03-01
* Last modified: 2020-03-01
* Author: Josen Pottackal
* Copy right no copyright
* Version: 1.0
*/

public abstract class Product {
	
	protected double price;
	protected int numStock;
	
	public Product(double price, int numStock) {
		this.price = price;
		this.numStock = numStock;
	}

	/**
	 * Get the price of the product.
	 * @return The price of the product in pounds.
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Set the price of the product.
	 * @param price The price of the product in pounds.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Get the amount of product in stock.
	 * @return The amount of product in stock.
	 */
	public int getNumStock() {
		return numStock;
	}
	
	/**
	 * Set the amount of product in stock.
	 * @param numStock The amount of product in stock.
	 */
	public void setNumStock(int numStock) {
		this.numStock = numStock;
	}
}
