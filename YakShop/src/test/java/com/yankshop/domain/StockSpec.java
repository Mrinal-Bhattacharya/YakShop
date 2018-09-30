package com.yankshop.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StockSpec {

	@Test
	public void getDetails() {
		Herd herd = new Herd();
		herd.add(new LabYak("Betty-1", 4.0));
		herd.add(new LabYak("Betty-2", 8.0));
		herd.add(new LabYak("Betty-3", 9.5));
		Stock stock = new Stock(herd);
		String expected = "In Stock:\n1104.48 liters of milk\n3 skins of wool\nHerd:\nBetty-1 4.13 years old\nBetty-2 8.13 years old\nBetty-3 9.63 years old\n";
		assertThat(stock.getDetails(13)).isEqualTo(expected);
	}

}
