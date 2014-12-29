package TheMoneyExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class TheMoneyExample {

	@Test
	public void testMultiplication() {
		Dollar ten = new Dollar(10);
		ten.times(3);
		assertEquals(30, ten.amount);
	}

}
