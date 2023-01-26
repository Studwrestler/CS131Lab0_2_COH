/**
 * This class allows you to create an array of squares along with being able to
 * repeat forwards and backwards through the array and being able to sum them
 * all together
 * 
 * @author Chase Hall
 * @version 1/25/23 
 * CS131Lab0_2_COH 
 * Spring 2023
 */
public class ArrayFun {
	Square[] myArray;// myArray will be used to store the squares and allow you access to them

	/**
	 * Initializes the Array length being set to 6
	 */
	public ArrayFun() {
		this.myArray[6] = new Square(6);
	}// end constructor

	/**
	 * Allows you to create the length of the array
	 * @param i the value i is being used to determine the length of the array through the calling method
	 */
	public ArrayFun(int i) {
		this.myArray = new Square[i];
		for (i = 0; i < myArray.length; i++) {
			myArray[i] = new Square(i);
		}
	}//end constructor
	/**
	 * forward outputs the area in order from first to last
	 */

	public void forward() {
		for (int i = 0; i < myArray.length; i++) {
			double element = myArray[i].area();
			System.out.println(element);
		}//end forward
	}
	/**
	 * backward outputs the areas in reverse order from last to first
	 */
	public void backward() {
		for (int i = myArray.length - 1; i >= 0; i--) {
			double element = myArray[i].area();
			System.out.println(element);
		}//end forward
	}
	/**
	 * Finds the sum of the entire array
	 * @return the sum of the entire Array
	 */

	public double sum() {
		double sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			sum += myArray[i].area();
		}
		return sum;
		}// end sum
	/** 
	 * Gets the value at that index of the array
	 *@param index the value index is used to find which part of the Array you are looking for
	 *@return the current value of the Array at that index
	 */
	public Square getArrayItem(int index) {
			return myArray[index];
		}// end getArrayItem
	/**
	 * Allows you to set the value of the index within that array
	 * @param index is the the value being chosen to change within the array
	 * @param s is the value being set to that index of the array
	 */

	public void setArrayItem(int index, Square s) {
			myArray[index] = s;
	
	}//end setArrayItem
}//end class
