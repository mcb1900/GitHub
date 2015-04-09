package ETS;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	static Calculadora calculadora;

	@BeforeClass
	public static void Antes(){
		calculadora = new Calculadora(3, 5);
	}

	@Test
	public void testSuma() {
		double resultado = calculadora.suma();
		assertTrue(resultado == 8);
	}

	@Test
	public void testResta() {
		double resultado = calculadora.resta();
		assertTrue(resultado == -2);
	}
	@Test
	public void testMultiplicar() {
		double resultado = calculadora.multiplica();
		assertTrue(resultado == 15);
	}
	@Test
	public void testDividir() {
		double resultado = calculadora.divide();
		assertTrue(resultado == 0.6);
	}
}

