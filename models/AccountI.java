package models;

public interface AccountI {
	public boolean deposit(double valor);
	public boolean withdraw(double valor);
	public Customer getOwner();
	public int getId();
	public double getBalance();
	public void applyYield();
}
