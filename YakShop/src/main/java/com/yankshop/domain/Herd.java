package com.yankshop.domain;

import java.util.ArrayList;
import java.util.List;

public class Herd {
	private List<LabYak> labYaks = new ArrayList<>();
	
	public boolean add(LabYak labYak) {
		return labYaks.add(labYak);
	}
	
	public double getMilks(int days) {
		return labYaks.stream().mapToDouble(labYak->labYak.getMilk(days)).sum();
	}
	
	public int getSkins(int days) {
		return labYaks.stream().mapToInt(labYak->labYak.getWool(days)).sum();
	}

	public String getDetails(int days) {
		StringBuilder builder=new StringBuilder();
		builder.append("Herd:");
		builder.append("\n");
		for (LabYak labYak : labYaks) {
			builder.append(labYak.getDetails(days));
			builder.append("\n");
		}
		return builder.toString();
	}
}
