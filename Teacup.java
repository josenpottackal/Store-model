
/**
* File Name: Teacup.java
* Purpose: A class that models a teacup
* Date: 2020-02-07
* Last modified: 2020-02-07
* Author: Josen Pottackal
* Copy right no copyright
* Version: 1.0
*/

public class Teacup extends Product {
	
	protected double price;
	protected int numStock;
	protected int volumeOfTea;
	
	public Teacup(double price, int numStock, int volumeOfTea) {
		super (price, numStock);
		this.volumeOfTea = volumeOfTea;
	}
	
	public int getVolumeOfTea() {
        return volumeOfTea;
    }

}
