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
    
    //////////////////////////////////////////
    /// VALIDACION EXTREMIDADES Y OJOS /////
    /// ///////////////////////////////////

    /**
     * ✅ Caso 1:
     * Agregar brazos dentro del límite permitido.
     */
    @Test
    public void testAgregarBrazosCorrecto() {
        Alien a = new Alien(10, "Verde");

        boolean resultado = a.agregarBrazos(4);

        assertEquals(true, resultado);
        assertEquals(4, a.getNumeroBrazos());
    }

    /**
     * ❌ Caso 2:
     * Intentar agregar brazos superando el límite total (10).
     */
    @Test
    public void testAgregarBrazosExcedeLimite() {
        Alien a = new Alien(10, "Verde");

        a.agregarBrazos(8);
        boolean resultado = a.agregarBrazos(5);

        assertEquals(false, resultado);
        assertEquals(8, a.getNumeroBrazos());
    }

    /**
     * ✅ Caso 3:
     * Agregar piernas correctamente sin superar límite.
     */
    @Test
    public void testAgregarPiernasCorrecto() {
        Alien a = new Alien(10, "Rojo");

        boolean resultado = a.agregarPiernas(3);

        assertEquals(true, resultado);
        assertEquals(3, a.getNumeroPies());
    }

    /**
     * ❌ Caso 4:
     * Exceder límite total combinando brazos y piernas.
     */
    @Test
    public void testAgregarPiernasExcedeLimiteTotal() {
        Alien a = new Alien(10, "Azul");

        a.agregarBrazos(6);
        boolean resultado = a.agregarPiernas(5);

        assertEquals(false, resultado);
        assertEquals(0, a.getNumeroPies());
    }

    /**
     * ✅ Caso 5:
     * Tamaño pequeño (<=10), límite de ojos = 3
     */
    @Test
    public void testAgregarOjosTamanioPequenio() {
        Alien a = new Alien(10, "Negro");

        boolean r1 = a.agregarOjos(2);
        boolean r2 = a.agregarOjos(1);

        assertEquals(true, r1);
        assertEquals(true, r2);
        assertEquals(3, a.getNumeroOjos());
    }

    /**
     * ❌ Caso 6:
     * Tamaño pequeño (<=10), excede límite de ojos
     */
    @Test
    public void testAgregarOjosExcedePequenio() {
        Alien a = new Alien(10, "Negro");

        a.agregarOjos(3);
        boolean resultado = a.agregarOjos(1);

        assertEquals(false, resultado);
        assertEquals(3, a.getNumeroOjos());
    }

    /**
     * ✅ Caso 7:
     * Tamaño mediano (>10 y <=20), límite de ojos = 5
     */
    @Test
    public void testAgregarOjosTamanioMediano() {
        Alien a = new Alien(15, "Gris");

        boolean r1 = a.agregarOjos(3);
        boolean r2 = a.agregarOjos(2);

        assertEquals(true, r1);
        assertEquals(true, r2);
        assertEquals(5, a.getNumeroOjos());
    }

    /**
     * ❌ Caso 8:
     * Tamaño mediano, excede límite de ojos
     */
    @Test
    public void testAgregarOjosExcedeMediano() {
        Alien a = new Alien(15, "Gris");

        a.agregarOjos(5);
        boolean resultado = a.agregarOjos(1);

        assertEquals(false, resultado);
        assertEquals(5, a.getNumeroOjos());
    }

    /**
     * ✅ Caso 9:
     * Tamaño grande (>20), límite de ojos = 7
     */
    @Test
    public void testAgregarOjosTamanioGrande() {
        Alien a = new Alien(25, "Morado");

        boolean r1 = a.agregarOjos(4);
        boolean r2 = a.agregarOjos(3);

        assertEquals(true, r1);
        assertEquals(true, r2);
        assertEquals(7, a.getNumeroOjos());
    }

    /**
     * ❌ Caso 10:
     * Tamaño grande, excede límite de ojos
     */
    @Test
    public void testAgregarOjosExcedeGrande() {
        Alien a = new Alien(25, "Morado");

        a.agregarOjos(7);
        boolean resultado = a.agregarOjos(1);

        assertEquals(false, resultado);
        assertEquals(7, a.getNumeroOjos());
    }

    /**
     * ✅ Caso 11:
     * Verifica que el precio de extremidades depende del tamaño.
     */
    @Test
    public void testPrecioExtremidades() {
        Alien a = new Alien(20, "Verde");

        assertEquals(20 * 0.1, a.getPrecioExtremidades(), DELTA);
    }
}
