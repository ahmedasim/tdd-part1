package TheMoneyExample;

public class Franc extends Money {
	//private int amount;
	
	Franc(int amount){
		this.amount = amount;
	}
	
	public Franc times( int multiplier){
		return new Franc(this.amount * multiplier);
	}
	public boolean equals( Object object){
		Money money = (Money) object;
		return money.amount == this.amount;
	}
}
