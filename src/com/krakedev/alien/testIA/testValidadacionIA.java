package com.krakedev.alien.testIA;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.alien.Alien;

public class testValidadacionIA {

    private static final double DELTA = 0.0001;

    /**
     * ❌ Caso 1:
     * Tamaño menor a 5.
     * Se espera que el tamaño sea ajustado al mínimo permitido (5)
     * y que los precios se calculen en base a ese valor.
     */
    @Test
    public void testTamanioMenorAlMinimo() {
        Alien alien = new Alien(3, "Verde");

        assertEquals(5, alien.getTamanio());
        assertEquals("Verde", alien.getColor());

        assertEquals(5 * 0.2, alien.getPrecioCuerpo(), DELTA);
        assertEquals(5 * 0.1, alien.getPrecioExtremidades(), DELTA);
        assertEquals(5 * 0.05, alien.getPrecioOjo(), DELTA);
    }

    /**
     * ❌ Caso 2:
     * Tamaño mayor a 30.
     * Se espera que el tamaño sea ajustado al máximo permitido (30)
     * y que los precios se calculen correctamente.
     */
    @Test
    public void testTamanioMayorAlMaximo() {
        Alien alien = new Alien(50, "Rojo");

        assertEquals(30, alien.getTamanio());
        assertEquals("Rojo", alien.getColor());

        assertEquals(30 * 0.2, alien.getPrecioCuerpo(), DELTA);
        assertEquals(30 * 0.1, alien.getPrecioExtremidades(), DELTA);
        assertEquals(30 * 0.05, alien.getPrecioOjo(), DELTA);
    }

    /**
     * ✅ Caso 3:
     * Tamaño dentro del rango permitido.
     * Se debe respetar el tamaño y calcular precios correctamente.
     */
    @Test
    public void testTamanioValido() {
        Alien alien = new Alien(10, "Azul");

        assertEquals(10, alien.getTamanio());
        assertEquals("Azul", alien.getColor());

        assertEquals(10 * 0.2, alien.getPrecioCuerpo(), DELTA);
        assertEquals(10 * 0.1, alien.getPrecioExtremidades(), DELTA);
        assertEquals(10 * 0.05, alien.getPrecioOjo(), DELTA);
    }

    /**
     * ✅ Caso 4:
     * Verifica que el color asignado en el constructor
     * se mantenga correctamente.
     */
    @Test
    public void testColorAsignado() {
        Alien alien = new Alien(15, "Morado");

        assertEquals("Morado", alien.getColor());
    }

    /**
     * ✅ Caso 5:
     * Verifica que todos los precios sean coherentes
     * entre sí según el tamaño.
     */
    @Test
    public void testConsistenciaDePrecios() {
        Alien alien = new Alien(20, "Negro");

        double tamanio = alien.getTamanio();

        assertEquals(tamanio * 0.2, alien.getPrecioCuerpo(), DELTA);
        assertEquals(tamanio * 0.1, alien.getPrecioExtremidades(), DELTA);
        assertEquals(tamanio * 0.05, alien.getPrecioOjo(), DELTA);
    }
}
