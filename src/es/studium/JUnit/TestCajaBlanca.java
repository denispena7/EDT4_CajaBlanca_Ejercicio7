package es.studium.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca {

	@Test
	void camino1() {
		String resultadoReal = CajaBlanca.trianguloFilas(1);
		String resultadoEsperado = "1\n";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void camino2() {
		String resultadoReal = CajaBlanca.trianguloFilas(0);
		String resultadoEsperado = "";
		assertEquals(resultadoReal, resultadoEsperado);
	}
}