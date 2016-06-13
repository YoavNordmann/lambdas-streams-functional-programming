package org.nordmann.lectures.interfaces;

import java.io.IOException;


/**
 * The Class AImpl.
 */
public class AImpl implements A {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		A a = new AImpl();
		a.shout();
	}
	
}
