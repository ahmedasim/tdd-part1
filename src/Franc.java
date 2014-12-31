package TheMoneyExample;

public class Franc extends Money {
	//private int amount;
	private String currency;
	Franc(int amount){
		this.amount = amount;
		currency = "CHF";
	}
	
	public Franc times( int multiplier){
		return new Franc(this.amount * multiplier);
	}
	String currency() {
		return "CHF";
	}
	
}
