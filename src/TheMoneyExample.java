package TheMoneyExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class TheMoneyExample {

	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
	@Test 
	public void testEquality( ){
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		assertFalse(new Franc(5).equals(Money.dollar(5)));
	}
	
	@Test
	public void testFranMultiplication() {
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}
	
	@Test 
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
	
}
