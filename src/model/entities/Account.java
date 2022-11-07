package model.entities;

import model.exception.DomainsException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
		
	}
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void deposit(Double amount) throws Exception {
		balance += amount;
		
	}
	public void withdraw(Double amount)  {
		
		if( withDrawLimit < amount) {
			throw new DomainsException("The amount exceeds withdraw limit");
		}
		else if (balance < amount) {
			throw new DomainsException("Not enough balance");
		}
		else {
			balance -= amount;
		}
	}
	@Override
	public String toString() {
		return "New balance: "
				+String.format("%.2f", balance);
	}
	
	
	
}
