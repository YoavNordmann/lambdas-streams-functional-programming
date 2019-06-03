package org.nordmann.lectures.functional;

/**
 * The Class FunctionalExample3.
 */
public class FunctionalExample3 {


	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(FunctionalExample3::runBody);
		t.start();
		t.join();
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
