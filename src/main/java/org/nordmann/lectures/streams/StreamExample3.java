package org.nordmann.lectures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * The Class StreamExample3.
 */
public class StreamExample3 {
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList(
				"a4", "a1", "a3", "a2", "b1", "c2", "c1");
		
		long count = myList.stream()
				.filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				if(t.startsWith("a")){
					return true;
				}
				return false;
			}
			
		}).count();
		
		System.out.println(count);
	}

}
