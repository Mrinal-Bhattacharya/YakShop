package com.yankshop.domain;

public class LabYak {
	private String name;
	private int ageInDays = 0;

	public LabYak(String name, double age) {
		this.name = name;
		this.ageInDays = (int) (age * 100);
	}

	public double getMilk(int days) {
		double total = 0;
		for (int day = 0; day < days; day++) {
			int currentAge = (ageInDays + day);
			if (currentAge > 1000) {
				return total;
			}
			total += (50 - currentAge * 0.03);
		}
		return total;
	}

	public int getWool(int days) {
		int wool = 1; // for day 0
		int lastShave = ageInDays;
		for (int day = 1; day < days; day++) {
			int currentAgeInDays = ageInDays + day;
			double nextShaveDay = (8 + lastShave * 0.01);
			if (currentAgeInDays - lastShave > nextShaveDay) {
				wool++;
				lastShave = currentAgeInDays;
			}
		}
		return wool;
	}

	public String getYakDetails(int days) {
		return name + " " + (ageInDays + days) / 100 + " years old";
	}

	public String getDetails(int days) {
		double ageInYears = (ageInDays + days) / 100d;
		return name + " " + ageInYears + " years old";
	}

}