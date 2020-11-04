package com.java.bankaccount;

public class NickleNDime extends Account{
 private double withdrawCount;
 
  public NickleNDime() {
	  super();
	  withdrawCount=0;
  }
@Override
public double endMonthCharge() {
	return 5.0*withdrawCount;
}
@Override
public void withdraw(double m) {
	++withdrawCount;
	endMonthCharge();
	super.withdraw(m);
}
  
}
