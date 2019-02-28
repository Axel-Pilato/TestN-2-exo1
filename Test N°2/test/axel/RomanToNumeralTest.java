package axel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RomanToNumeralTest {

	public RomanToNumeral calc;
	
	@Before
	public void setUp() throws Exception {
		calc = new RomanToNumeral();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(21, calc.getNumeral("XXI"));
	}

}
