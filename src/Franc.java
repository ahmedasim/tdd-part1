package TheMoneyExample;

public class Franc {
	private int amount;
	
	Franc(int amount){
		this.amount = amount;
	}
	
	public Franc times( int multiplier){
		return new Franc(this.amount * multiplier);
	}
	public boolean equals( Object object){
		Franc franc = (Franc) object;
		return franc.amount == this.amount;
	}
}
