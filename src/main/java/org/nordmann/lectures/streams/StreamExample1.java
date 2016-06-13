package org.nordmann.lectures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * The Class StreamExample1.
 */
public class StreamExample1 {
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("a4", "a1", "a3", "a2", "b1", "c2", "c1");
		
		myList.stream().sorted().forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
	}

}
