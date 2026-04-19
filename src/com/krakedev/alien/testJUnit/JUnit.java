package com.krakedev.alien.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.alien.Alien;

class JUnit {

	@Test
	void testCrearAlienNormal() {

		Alien alien1 = new Alien(3, "rojo");
		
		assertEquals(5, alien1.getTamanio());
		assertEquals("rojo", alien1.getColor());
		assertEquals(1, alien1.getPrecioCuerpo());
		assertEquals(1.0, alien1.getPrecioCuerpo(), 0.001);
		assertEquals(0.5, alien1.getPrecioExtremidades(), 0.001);
		assertEquals(0.25, alien1.getPrecioOjo(), 0.001);
	}
}
