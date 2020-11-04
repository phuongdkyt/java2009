package com.java.bankaccount;

public class EmployeeWithBonus{
	 private double bonus;
	 Employee e;
	 
	public EmployeeWithBonus(String firstName, String lastName, double baseSalary,double bonus) {
		e=new Employee(firstName,lastName,baseSalary);
		setBonus(bonus);
	}
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		if(bonus>0)
			this.bonus = bonus;
	}

	public double Earnings() {
			return e.Earnings()+getBonus();
	}
	
}
