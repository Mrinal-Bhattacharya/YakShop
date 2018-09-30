package com.yankshop.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class HerdSpec {

	@Test
	public void getMilks() {
		Herd herd=new Herd();
		herd.add(new LabYak("Betty-1", 4.0));
		herd.add(new LabYak("Betty-2", 8.0));
		herd.add(new LabYak("Betty-3", 9.5));
		assertThat(herd.getMilks(13)).isEqualTo(1104.48);
		assertThat(herd.getMilks(14)).isEqualTo(1188.81);
		
	}

	@Test
	public void getSkins() {
		Herd herd=new Herd();
		herd.add(new LabYak("Betty-1", 4.0));
		herd.add(new LabYak("Betty-2", 8.0));
		herd.add(new LabYak("Betty-3", 9.5));
		assertThat(herd.getSkins(13)).isEqualTo(3);
		assertThat(herd.getSkins(14)).isEqualTo(4);
	}

}
