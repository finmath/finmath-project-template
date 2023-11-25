package net.finmath.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

	@Test
	public void test() {
		
		Example example = new Example(3141);
		
		int result = example.getValue();
		int expected = 3141;
		
		Assertions.assertEquals(expected, result);
	}

}
