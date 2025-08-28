package models;

public class Customer implements Comparable<Customer> {

	private String name;
	private String surname;
	private String rg;
	private String cpf;
	private String address;
	private int wage;
	private Account account;
	
	public Customer(String name, String surname, String rg, String cpf, String address, int wage) {
		this.name = name;
		this.surname = surname;
		this.rg = rg;
		this.cpf = cpf;
		this.address = address;
		this.wage = wage;
		this.account = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}



	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

    @Override
    public int compareTo(Customer other) {
        return this.name.compareTo(other.getName());
    }
}

