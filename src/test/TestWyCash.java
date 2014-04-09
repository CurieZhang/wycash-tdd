package test;

import static org.junit.Assert.assertEquals;
import main.Dollar;

import org.junit.Test;

public class TestWyCash {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}

}
