package TheMoneyExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class TheMoneyExample {

	@Test
	public void testMultiplication() {
		Dollar ten = new Dollar(10);
		//Dollar product = ten.times(3);
		assertEquals(new Dollar(30), ten.times(3));
		//product = ten.times(2);
		assertEquals(new Dollar(20), ten.times(2));
	}
	@Test 
	public void testEquality( ){
		assertTrue(new Dollar(30).equals(new Dollar(30)));
		assertFalse(new Dollar(20).equals(new Dollar(30)));
	}

}
