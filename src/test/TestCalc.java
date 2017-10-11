import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalc {
	private Calc calc;

	@Before
	public void setUp() throws Exception {
		calc = new Calc();
	}

	@Test
	public void testAdd() {
		assertEquals(8, calc.add(6, 2));
	}

	@Test
	public void testSubtration() {
		assertEquals(4, calc.subtration(6, 2));
	}

	@Test
	public void testDivide() {
		assertEquals(3, calc.divide(6, 2));
	}
}
