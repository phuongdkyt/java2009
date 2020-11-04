package com.java.bankaccount;

public  class Account {
 private double balance;
 private int transactions=0;
 
 public Account() {
	 this.balance=50;//mac dinh so du tk se la 50
}
public double getBalance() {
	return balance;
}
public int getTransactions() {
	return transactions;
}

public void deposit(double amount) {
	transactions++;
	if(amount>=0)
		this.balance+=amount;
	else throw new IllegalArgumentException("Amount must be 0");
 }
 public void withdraw(double amount) {
	transactions++;
	if(this.balance>=amount)
		this.balance-=amount;
	else throw new IllegalArgumentException("Balance must be Amount");
	 
 }
 public double endMonthCharge() {
	 return 0;
 }
 
 public void endMonth() {
	 System.out.println("Monthly account transaction fee: "+endMonthCharge());
	 System.out.println("The remaining amount: "+getBalance());
	 System.out.println("Total transactions: "+getTransactions()); 
	 transactions=0;
 }
}
