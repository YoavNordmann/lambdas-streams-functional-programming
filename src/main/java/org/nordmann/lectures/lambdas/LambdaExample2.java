package org.nordmann.lectures.lambdas;

import java.util.Arrays;
import java.util.List;

/**
 * The Class LambdaExample2.
 */
public class LambdaExample2 {
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("a4", "a1", "a3", "a2", "b1", "c2", "c1");
		myList.stream().filter(x -> x.endsWith("1")).map(x -> x.toUpperCase()).forEach(x -> System.out.println(x));
		
	}

}
