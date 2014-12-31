package TheMoneyExample;

public class Dollar extends Money {
	
	//private int amount;
	
	private String currency;
	Dollar(int amount) {
		this.amount = amount;
		currency = "USD";
	}
	
	public Dollar times(int multiplier){
		return new Dollar(this.amount * multiplier);
	}
	
	String currency() {
		return "USD";
	}
}
