package TheMoneyExample;

public class Franc extends Money {
	//private int amount;
	
	Franc(int amount, String currency) {
		super(amount, currency);
	}
	
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	String currency() {
		return "CHF";
	}
	
}
