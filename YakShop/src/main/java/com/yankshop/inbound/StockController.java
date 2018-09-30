package com.yankshop.inbound;

import com.yankshop.common.XMLReader;
import com.yankshop.common.YankShopException;
import com.yankshop.domain.Herd;
import com.yankshop.domain.Stock;

public class StockController {

	public String getStockDetails(String fileName, int days) throws YankShopException {
		XMLReader reader = new XMLReader();
		String output = "";
		Herd herd = reader.getHerd(fileName);
		Stock stock = new Stock(herd);
		output = stock.getDetails(days);
		return output;
	}

}
