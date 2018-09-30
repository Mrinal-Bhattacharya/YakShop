package com.yankshop.common;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.yankshop.domain.Herd;

public class XMLReaderSpec {

	@Test
	public void getHerd() throws YankShopException {
		XMLReader reader=new XMLReader();
		Herd herd = reader.getHerd("herd.xml");
		assertThat(herd).isNotNull();
		assertThat(herd.getMilks(13)).isEqualTo(1104.48);
		assertThat(herd.getSkins(13)).isEqualTo(3);
	}
	
	@Test(expected=YankShopException.class)
	public void shouldThrowException() throws YankShopException {
		XMLReader reader=new XMLReader();
		Herd herd = reader.getHerd("invalid.xml");
		assertThat(herd).isNotNull();
		assertThat(herd.getMilks(13)).isEqualTo(1104.48);
		assertThat(herd.getSkins(13)).isEqualTo(3);
	}

}
