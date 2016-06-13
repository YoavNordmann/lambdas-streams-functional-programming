package org.nordmann.lectures.functional;

import java.util.Arrays;
import java.util.List;

/**
 * The Class FunctionalExample1.
 */
public class FunctionalExample1 {
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a4", "a1", "a3", "a2", "b1", "c2", "c1");
		myList.stream().sorted().forEach(System.out::println);
	}

}
