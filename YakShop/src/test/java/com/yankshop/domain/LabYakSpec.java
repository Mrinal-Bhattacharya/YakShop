package com.yankshop.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class LabYakSpec{

	@Test
	public void getMilkFromYak() {
		LabYak labYak = new LabYak("a",4.0);
		double milk = labYak.getMilk(13);
		assertThat(milk).isEqualTo(491.66);
	}
	
	@Test
	public void getMilkFromYakBeforeDying() {
		LabYak labYak = new LabYak("a",9.99);
		double milk = labYak.getMilk(2);
		assertThat(milk).isEqualTo(40.03);
	}

	@Test
	public void getWoolFromYak() {
		LabYak labYak = new LabYak("a",4.0);
		double wool = labYak.getWool(13);
		assertThat(wool).isEqualTo(1);
	}
	
}
