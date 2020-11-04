package com.java.bankaccount;

public class Fee extends Account{

	public Fee() {
		super();
	}

	@Override
	public double endMonthCharge() {
		return 5.0;
	}



}
