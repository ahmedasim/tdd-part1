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
		assertTrue(new Dollar(10).equals(new Dollar(10)));
		assertFalse(new Dollar(50).equals(new Dollar(60)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
	}
	
	@Test
	public void testFranMultiplication() {
		Franc five = new Franc(5);
		//Dollar product = ten.times(3);
		assertEquals(new Franc(15), five.times(3));
		//product = ten.times(2);
		assertEquals(new Franc(10), five.times(2));
	}
	
	
	
}
