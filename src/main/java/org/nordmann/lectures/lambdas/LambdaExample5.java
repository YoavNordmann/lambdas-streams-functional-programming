package org.nordmann.lectures.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * The Class LambdaExample5.
 */
public class LambdaExample5 {


	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("a4", "a1", "a3", "a2", "b1", "c2", "c1");
		
		myList.stream().filter(getPredicate("b")).forEach(printFunction);		
		
	}


	
	/**
	 * Gets the predicate.
	 *
	 * @param input the input
	 * @return the predicate
	 */
	private static Predicate<String> getPredicate(String input){
		 return x -> x.startsWith(input);
	}
	
	
	/** The print function. */
	private static Consumer<String> printFunction = x -> System.out.println(x);
	
	
	
	
}
