package testesCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {

	@Test
	void doisSomaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();
		assertEquals(4, c.SomaInteiros(2, 2));
	}
	
	@Test
	void tresSomaSeteEsperaDez() {
		Calculadora c = new Calculadora();
		assertTrue(c.SomaInteiros(3, 7)==10);
		
	}
	
	@Test
	void doisSubratiDoisEsperaZero() {
		Calculadora c = new Calculadora();
		assertEquals(0, c.subtraiInteiros(2, 2));
	}
	
	@Test
	void tresSubtraiSeteEsperaQuatroNegativo() {
		Calculadora c = new Calculadora();
		assertTrue(c.subtraiInteiros(3, 7)==-4);

	}
	
	@Test
	void doisMultiplicaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();
		assertEquals(4, c.multiplicaInteiros(2, 2));
	}
	
	@Test
	void tresMultiplicaSeteEsperaEUm() {
		Calculadora c = new Calculadora();
		assertTrue(c.multiplicaInteiros(3, 7)==21);

	}
	
	@Test
	void doisDivideDoisEsperaUm() {
		Calculadora c = new Calculadora();
		assertEquals(1, c.dividiInteiros(2, 2));
	}
	
	@Test
	void dezDivideDoisEsperadois() {
		Calculadora c = new Calculadora();
		assertTrue(c.dividiInteiros(10, 2)==5);

	}
}