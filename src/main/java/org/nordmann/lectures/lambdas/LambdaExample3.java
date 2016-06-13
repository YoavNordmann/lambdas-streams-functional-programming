package org.nordmann.lectures.lambdas;

import java.util.Arrays;
import java.util.List;

/**
 * The Class LambdaExample3.
 */
public class LambdaExample3 {
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(1,2,3,4,5);
		
		myList.forEach(x ->{
			int y = x * 2;
			System.out.println(y);
		});
	}

}
