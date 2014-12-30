package TheMoneyExample;

public class Dollar extends Money {
	
	//private int amount;
	
	Dollar(int amount){
		this.amount = amount;
	}
	
	public Dollar times(int multiplier){
		return new Dollar(this.amount * multiplier);
	}

}
