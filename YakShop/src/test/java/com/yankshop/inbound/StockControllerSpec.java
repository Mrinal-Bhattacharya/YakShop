package com.yankshop.inbound;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.yankshop.common.YankShopException;

public class StockControllerSpec {

	@Test
	public void getStockDetails() throws YankShopException {
		StockController controller = new StockController();
		String stockDetails = controller.getStockDetails("herd.xml", 14);
		String expected = "In Stock:\n1188.81 liters of milk\n4 skins of wool\nHerd:\nBetty-1 4.14 years old\nBetty-2 8.14 years old\nBetty-3 9.64 years old\n";
		assertThat(stockDetails).isEqualTo(expected);
	}

	@Test
	public void shouldThrowExceptionInInvalidFile() {
		StockController controller = new StockController();
		try {
		controller.getStockDetails("invalid.xml", 14);
		fail("It should throw YankShopException for invalid xml file.");
		}
		catch(YankShopException e) {
			assertThat(e.getMessage()).isEqualTo("InputStream cannot be null");
		}
	}

}
