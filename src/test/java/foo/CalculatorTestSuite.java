package foo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


@RunWith (value=Suite.class)                //1. @RunWith runner
@SuiteClasses(value={CalculatorTest.class}) //2. @SuiteClasses
public class CalculatorTestSuite extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(CalculatorTestSuite.class.getName());
		//$JUnit-BEGIN$

		
		//$JUnit-END$
		return suite;
	}

}
