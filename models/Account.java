package models;

public abstract class Account implements AccountI {

	private Customer owner;
	private int id;
	private double balance;
	
	public Account(Customer owner, int id, double balance) {
		this.owner = owner;
		this.id = id;
		this.balance = balance;
		}
	
	@Override
	public boolean deposit(double amount) {
		if (amount>0) {									//valor deve ser positivo
			this.setBalance(this.getBalance() + amount);	//se aumentar o valor do saldo
			return true;								//retorna true
		}
		return false;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if (amount>0) {  			//implementacao da logica fica pras filhas
			return true;
		}
		return false;
	}
	
	@Override
	public Customer getOwner() {
		return this.owner;
	}

	@Override
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
	this.balance = balance;
	}
	
	public abstract void applyYield();
}
	
	

