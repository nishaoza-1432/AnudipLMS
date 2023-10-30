package java_junit_assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	Calculator calculator = new Calculator();// creating new object

	@Test // testing for addition
	public void testAdd() {
		assertEquals(5, calculator.add(2, 3));
		assertEquals(-1, calculator.add(2, -3));
	}

	@Test // testing for subtraction
	public void testSubtract() {
		assertEquals(1, calculator.subtract(4, 3));
		assertEquals(-5, calculator.subtract(2, 7));
	}

	@Test // testing for multiplication
	public void testMultiply() {
		assertEquals(6, calculator.multiply(2, 3));
		assertEquals(0, calculator.multiply(5, 0));
	}

	@Test // testing for division
	public void testDivide() {
		assertEquals(2.0, calculator.divide(6, 3), 0.001);
		assertEquals(-5.0, calculator.divide(10, -2), 0.001);
	}
}
