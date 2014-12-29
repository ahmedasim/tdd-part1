package TheMoneyExample;

public class Dollar {
	
	private	int amount;
	
	Dollar(int amount){
		this.amount = amount;
	}
	
	public Dollar times(int multiplier){
		return new Dollar(this.amount * multiplier);
	}
	public boolean equals( Object object){
		Dollar dollar = (Dollar) object;
		return dollar.amount == this.amount;
	}

}
