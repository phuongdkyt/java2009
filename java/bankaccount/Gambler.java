package com.java.bankaccount;

public class Gambler extends Account {
  
	public Gambler() {
		super();
	}

	@Override
	public void withdraw(double m) {
		int x=(int) (Math.random()*99);
		if(x<=49)
			super.withdraw(0);
		else 
			super.withdraw(2*m);
	}

	@Override
	public double endMonthCharge() {
		return 0;
	}

}
