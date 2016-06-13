package org.nordmann.lectures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * The Class StreamExample2.
 */
public class StreamExample2 {
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("a4", "a1", "a3", "a2", "b1", "c2", "c1");
		
		myList.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				if(t.endsWith("1")){
					return true;
				}
				return false;
			}
			
		}).map(new Function<String, String>() {
			
			@Override
			public String apply(String t) {
				return t.toUpperCase(); 
			}
			
		}).forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
	}

}
