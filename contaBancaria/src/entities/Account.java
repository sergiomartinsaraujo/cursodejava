package entities;

import java.util.StringTokenizer;

public class Account {
	private int number;
	private String holder;
	private double balance;
	//contrutor
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	//Construtor
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	//M�todos getters e setters
	public int getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	//M�todos
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	public String toString() {
		return "Account " 
				+ number
				+ ", holder "
				+ holder
				+ ", balance: $ "
				+ String.format("%.2f", balance);
				
	}
	
}
