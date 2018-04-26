package fr.sma.blacksnail.web.controller;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PublicControllerTest {


	private PublicController publicController;

	@Before
	public void setUp() {
		publicController = new PublicController();
	}

	@Test
	public void hello() {
		// WHEN THEN
		assertThat(publicController.hello()).isEqualTo("Hello World!");
	}

}
