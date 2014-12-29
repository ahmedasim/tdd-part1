package TheMoneyExample;

public class Dollar {
	
	int amount;
	
	Dollar(int amount){
		this.amount = amount;
	}
	
	public void times(int multiplier){
		this.amount *=  multiplier;
	}

}
