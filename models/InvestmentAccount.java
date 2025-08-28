package models;

public class InvestmentAccount extends Account {

	private double depositMin;
	private double amountMin;
	
	public InvestmentAccount (Customer owner, int id, double balance, double depositMin, double amountMin) {
		super(owner, id, balance);
		this.depositMin = depositMin;
		this.amountMin = amountMin;
	}
	
	public double getDepositMin() {
		return depositMin;
	}
	public void setDepositMin(double depositMin) {
		this.depositMin = depositMin;
	}
	public double getAmountMin() {
		return amountMin;
	}
	public void setAmountMin(double amountMin) {
		this.amountMin = amountMin;
	}
	
	@Override
	public boolean deposit(double amount) {
		if (amount >= this.depositMin) {
		return super.deposit(amount);

			} else { return false;
		}
	}

	@Override
	public boolean withdraw(double amount) {
			if (getBalance() - amount >= this.amountMin){
				this.setBalance(this.getBalance() - amount);
				return super.withdraw(amount);
				
			} else { return false;
		}
	}
	
	@Override
	public void applyYield() {
			this.setBalance(this.getBalance() * 1.02);
		}
	}	