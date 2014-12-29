package TheMoneyExample;

public class Dollar {
	
	int amount;
	
	Dollar(int amount){
		this.amount = amount;
	}
	
	public Dollar times(int multiplier){
		return new Dollar(this.amount * multiplier);
	}

}
