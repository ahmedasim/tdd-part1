package TheMoneyExample;

public class Dollar extends Money {
	
	//private int amount;
	
	
	Dollar(int amount, String currency) {
		super(amount, currency);
	}
	
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	String currency() {
		return "USD";
	}
}
