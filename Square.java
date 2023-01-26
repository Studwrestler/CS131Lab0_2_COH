/**
 * This class allows you to create squares and find the area of them
 * @author Chase Hall
 * @version 1/25/23
 * CS131Lab0_2_COH
 * Spring 2023
 */
public class Square {
	double side;// side will be used to find the area of the square
	/**
	 * Initializes side being set to 0
	 */
	public Square() {
		this.side=0;
	}//end constructor
	/**
	 * allows you to set the value of the side to anything you want
	 * @param side the value of side is based on the calling method
	 */
	public Square(double side) {
		this.side=side;
	}//end constructor
	/**
	 * Finds the area of the square
	 * @return the new value area
	 */
	public double area() {
		double area=Math.pow(side, 2);
		return area;
	}//end area
	/**
	 * Returns the current value of the side
	 * @return the current value of side
	 */
	public double getSide() {
		return side;
	}//end getSide
	/**
	 * Allows you to change the current value of the side
	 * @param side the value of side to be set
	 */
	public void setSide(double side) {
		this.side=side;
	}//end setSide
	
}//end class
