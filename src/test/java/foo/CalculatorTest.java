package foo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class) //1. @RunWith annotation
public class CalculatorTest {
	private double expected;        //2. number of parameters in the functions to be tested + number of return value
	private double valueOne;
	private double valueTwo;
	
	@Parameters                     //3. @Parameters annotation
	public static Collection<Integer[]> getTestParameters2(){   //4. public static Collection< types > getTestParameters(), function name doesn't matter
		return Arrays.asList(new Integer[][]{
				{2, 1, 1},
				{3, 2, 1}, 
				{5, 2, 3},
		});
	}
	
	
	public CalculatorTest(double expected, double valueOne, double valueTwo) {  //5. can have Only 1 constructor 
		super();
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}


	@Test
	public void testAdd() {                   //6. test function add(), need to add @Test annotation
		Calculator cal = new Calculator();
		double result = cal.add(10, 20);
		double expected = 30;
		assertEquals(expected, result, 0);		
	}
	
	@Test
	public void sum(){                        //7. Each function with @Test will execute several times depending on how many parameters in the getTestParameter()
		Calculator cal = new Calculator();
		assertEquals(expected, cal.add(valueOne, valueTwo), 0);
	}

}
