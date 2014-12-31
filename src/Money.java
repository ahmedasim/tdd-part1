package TheMoneyExample;

abstract class Money {
	protected int amount;
	
	public boolean equals(Object object) {
		Money money= (Money) object;
		return amount == money.amount &&
				this.getClass() == money.getClass();
	}
	static Money franc( int amount){
		return new Franc(amount);
	}
	static Money dollar( int amount){
		return new Dollar(amount);
	}
	abstract Money times(int multiplier);
	abstract String currency();
}
