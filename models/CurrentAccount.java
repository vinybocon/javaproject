package models;

public class CurrentAccount extends Account {

	private double limit;
	
	public CurrentAccount(Customer owner, int id, double balance, double limit) {
		super(owner, id, balance);
		this.limit = limit;
	
	}

	@Override
	public boolean withdraw(double amount) {
			if (this.getBalance()- amount >= -this.limit){ //se o saldo - o valor do saque for maior que o limite
				this.setBalance(this.getBalance() - amount);	//saque efetuado
				return true;
		} else {
			return false;
		}
	}

	@Override
	public void applyYield() {
		this.setBalance(this.getBalance() * 1.01);	//le o saldo e remunera o saldo a 1%	
	}
}
	