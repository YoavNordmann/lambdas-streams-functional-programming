package org.nordmann.lectures.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * The Class FunctionalExample4.
 */
public class FunctionalExample4 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList(
				"a4", "a1", "a3", "a2", "b1", "c2", "c1");
		
		filterByPrefix(myList.stream(), getPredicate("b"));
		
	}
	
	
	/**
	 * Filter by prefix.
	 *
	 * @param stream the stream
	 * @param predicate the predicate
	 */
	private static void filterByPrefix(Stream<String> stream, Predicate<String> predicate){
		stream.filter(predicate).forEach(printFunction);
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
	private static Consumer<String> printFunction = System.out::println;
	
	

	
}
