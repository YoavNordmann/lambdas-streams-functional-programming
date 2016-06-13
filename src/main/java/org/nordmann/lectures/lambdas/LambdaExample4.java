package org.nordmann.lectures.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * The Class LambdaExample4.
 */
public class LambdaExample4 {


	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("a4", "a1", "a3", "a2", "b1", "c2", "c1");
		
		myList.stream().filter(predicate).forEach(x -> System.out.println(x));		
		
	}


	/** The predicate. */
	private static Predicate<String> predicate = x -> x.startsWith("a");
	
	
}
