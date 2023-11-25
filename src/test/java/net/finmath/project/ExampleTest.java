package net.finmath.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test of the exmaple class.
 * 
 * @author Christian Fries
 */
public class ExampleTest {

	/**
	 * Check if the input is returned in the getter.
	 */
	@Test
	public void test() {
		
		Example example = new Example(3141);
		
		int result = example.getValue();
		int expected = 3141;
		
		Assertions.assertEquals(expected, result);
	}

}
