package TheMoneyExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class TheMoneyExample {

	@Test
	public void testMultiplication() {
		Dollar ten = new Dollar(10);
		Dollar product = ten.times(3);
		assertEquals(30, product.amount);
		product = ten.times(2);
		assertEquals(20, product.amount);
	}
	@Test 
	public void testEquality( ){
		assertTrue(new Dollar(30).equals(new Dollar(30)));
		assertFalse(new Dollar(30).equals(new Dollar(30)));
	}

}
