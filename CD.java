
/**
* File Name: CD.java
* Purpose: A class that models a CD
* Date: 2020-03-01
* Last modified: 2020-03-01
* Author: Josen Pottackal
* Copy right no copyright
* Version: 1.0
*/

public class CD extends Playable {
	
	protected double price;
	protected int numStock;
	protected double runtime;
	protected String title;
	protected String artist;
	
	public CD(double price, int numStock, double runtime, String title, String artist) {
		super (price, numStock, runtime, title);
		this.artist = artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
        return artist;
    }
	
	public void play() {
		System.out.println(title + " is playing");
	}
	
}
