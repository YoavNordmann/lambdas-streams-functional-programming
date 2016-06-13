package org.nordmann.lectures.functional;

/**
 * The Class FunctionalExample3.
 */
public class FunctionalExample3 {


	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new Thread(FunctionalExample3::runBody).start();
	}
	
	
	/**
	 * Run body.
	 */
	public static void runBody() {
		for(int i = 0;i < 10; i++) {
			System.out.println("square of "+i+" is " + (i*i));
		}
	}


}
