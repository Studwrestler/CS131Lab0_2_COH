/**
 * This class allows you to access myArray and allows you to loop forward and backward along with being able to find the sum
 * @author Chase Hall
 * @version 1/25/23 
 * CS131Lab0_2_COH 
 * Spring 2023
 */
public class Application {
	/**
	 * Default
	 */
	Application(){
		
	}
	/**
	 * Main loop of Application
	 * @param args Arguments with in Application
	 */
	public static void main(String[] args) {
		ArrayFun myArray = new ArrayFun(10);
		myArray.forward();
		myArray.backward();
		System.out.println(myArray.sum());
		

	}// end main

}//end class
