package TA21_AdrianGallego.TA21_AdrianGallego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraVistaTest {

	private CalculadoraVista calculadora;

    @BeforeEach
    public void setUp() {
    	calculadora = new CalculadoraVista();
    }

    @Test
    public void testSuma() {
        double resultado = calculadora.realizarOperacion(5.0, 3.0, "+");
        double esperado = 8.0;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testResta() {
        double resultado = calculadora.realizarOperacion(5.0, 3.0, "-");
        double esperado = 2.0;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMulti() {
        double resultado = calculadora.realizarOperacion(5.0, 3.0, "*");
        double esperado = 15.0;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testDivision() {
        double resultado = calculadora.realizarOperacion(6.0, 3.0, "/");
        double esperado = 2.0;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testIsDecimal() {
        calculadora.print = "2.";
        assertTrue(calculadora.isDecimal());
    }


}
