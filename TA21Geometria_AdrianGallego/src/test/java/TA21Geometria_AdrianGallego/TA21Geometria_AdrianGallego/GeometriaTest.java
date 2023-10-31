package TA21Geometria_AdrianGallego.TA21Geometria_AdrianGallego;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



class GeometriaTest {

	Geometria gm;
	
	
	@BeforeEach
	public void beforeEach() {
		gm = new Geometria();
	}
	
	@Test
	public void testAreaCuadrado() {
		int resultado = gm.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaCirculo() {
		double resultado = gm.areaCirculo(2);
		double esperado = 12.5664;
		assertEquals(esperado, resultado);
	}
	
	@Test 
	public void testAreaTriangulo() {
		int resultado = gm.areatriangulo(4, 3);
		int esperado = 6;
		assertEquals(esperado, resultado);
	}
	
	@Test 
	public void testAreaRectangulo() {
		int resultado = gm.arearectangulo(5, 8);
		int esperado = 40;
		assertEquals(esperado, resultado);
	}
	
	@Test 
	public void testAreaPentagono() {
		int resultado = gm.areapentagono(6, 9);
		int esperado = 27;
		assertEquals(esperado, resultado);
	}
	
	@Test 
	public void testAreaRombo() {
		int resultado = gm.arearombo(7, 5);
		int esperado = 17;
		assertEquals(esperado, resultado);
	}
	
	@Test 
	public void testAreaRomboide() {
		int resultado = gm.arearomboide(3, 9);
		int esperado = 27;
		assertEquals(esperado, resultado);
	}
	
	@Test 
	public void testAreaTrapecio() {
		int resultado = gm.areatrapecio(6,4,8);
		int esperado = 40;
		assertEquals(esperado, resultado);
	}
	
	private static Stream<Arguments> getFormatFixture() {
        return Stream.of(
                Arguments.of(1), 
                Arguments.of(2),
                Arguments.of(3),
                Arguments.of(4),
                Arguments.of(5),
                Arguments.of(6),
                Arguments.of(7),
                Arguments.of(8)
                );
    }
	
	@ParameterizedTest
    @MethodSource("getFormatFixture")
	public void testGetterSetter(int id) {
		Geometria geo = new Geometria(id);

		int area = 5;
		String nom = "Rombo";
		
		geo.setArea(area);
		geo.setNom(nom);
		geo.setId(id);

		geo.toString();
		
		assertEquals(area, geo.getArea());
		assertEquals(id, geo.getId());
		assertEquals(nom, geo.getNom());

	}
	
	@Test 
	public void testFigura() {
		String resultado = gm.figura(1);
		String esperado = "cuadrado";
		
		assertEquals(esperado, resultado);
	}

}
