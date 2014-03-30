package foo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		double result = cal.add(10, 20);
		double expected = 30;
		assertEquals(expected, result, 0);		
	}

}
