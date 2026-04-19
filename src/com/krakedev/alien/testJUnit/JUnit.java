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
		assertEquals(1.0, alien1.getPrecioCuerpo(), 0.001);
		assertEquals(0.5, alien1.getPrecioExtremidades(), 0.001);
		assertEquals(0.25, alien1.getPrecioOjo(), 0.001);

		Alien alien2 = new Alien(35, "rojo");

		assertEquals(30, alien2.getTamanio());
		assertEquals("rojo", alien2.getColor());
		assertEquals(6.0, alien2.getPrecioCuerpo(), 0.001);
		assertEquals(3, alien2.getPrecioExtremidades(), 0.001);
		assertEquals(1.5, alien2.getPrecioOjo(), 0.001);
		
		Alien alien3 = new Alien(20, "rojo");

		assertEquals(20, alien3.getTamanio());
		assertEquals("rojo", alien3.getColor());
		assertEquals(4.0, alien3.getPrecioCuerpo(), 0.001);
		assertEquals(2, alien3.getPrecioExtremidades(), 0.001);
		assertEquals(1, alien3.getPrecioOjo(), 0.001);
		
		alien3.imprimir();
	}
}
