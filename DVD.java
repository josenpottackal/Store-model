
/**
* File Name: DVD.java
* Purpose: A class that models a DVD
* Date: 2020-03-01
* Last modified: 2020-03-01
* Author: Josen Pottackal
* Copy right no copyright
* Version: 1.0
*/

public class DVD extends Playable{
	
	protected double price;
	protected int numStock;
	protected double runtime;
	protected String title;
	protected String director;
	
	public DVD(double price, int numStock, double runtime, String title, String director) {
		super(price, numStock, runtime, title);
		this.director = director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getDirector() {
        return director;
    }
	
	public void play() {
		System.out.println(title + " is playing");
	}
	
	@Override
	public double getRentalCost() {
		return 1.20;
	}
}
