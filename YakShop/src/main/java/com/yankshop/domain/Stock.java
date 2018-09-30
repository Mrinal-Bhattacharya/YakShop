package com.yankshop.domain;

public class Stock {
	private Herd herd;

	public Stock(Herd herd) {
		this.herd = herd;
	}

	public String getDetails(int days) {
		StringBuilder builder = new StringBuilder();
		builder.append("In Stock:");
		builder.append("\n");
		builder.append(herd.getMilks(days));
		builder.append(" liters of milk");
		builder.append("\n");
		builder.append(herd.getSkins(days));
		builder.append(" skins of wool");
		builder.append("\n");
		builder.append(herd.getDetails(days));
		return builder.toString();
	}

}
