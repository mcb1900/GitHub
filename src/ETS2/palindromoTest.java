package ETS2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class palindromoTest {
	static palindromo pali;
	
	@BeforeClass
	public static void Antes(){
		String prueba = "Vacaciones";
		pali = new palindromo(prueba);
	}

	@Test
	public void testVacio() {
		String prueba = "";
		pali = new palindromo(prueba);
		String resultado = pali.palin();
		String comprobar = "";
		assertTrue(resultado.equals(comprobar));
	}
	
	@Test
	public void testBlancoInicio() {
		String prueba = " Vacaciones";
		pali = new palindromo(prueba);
		String resultado = pali.palin();
		String comprobar = " VacacionessenoicacaV ";
		assertTrue(resultado.equals(comprobar));
	}
	
	@Test
	public void testBlancoFin() {
		String prueba = "Vacaciones ";
		pali = new palindromo(prueba);
		String resultado = pali.palin();
		String comprobar = "Vacaciones  senoicacaV";
		assertTrue(resultado.equals(comprobar));
	}
	
	@Test
	public void testUno() {
		String prueba = "c";
		pali = new palindromo(prueba);
		String resultado = pali.palin();
		String comprobar = "cc";
		assertTrue(resultado.equals(comprobar));
	}
	
	@Test
	public void testTamaño4() {
		String prueba = "hola";
		pali = new palindromo(prueba);
		String resultado = pali.palin();
		String comprobar = "holaaloh";
		assertTrue(resultado.equals(comprobar));
	}
	
	@Test
	public void testTamaño10() {
		String prueba = "Adios lol";
		pali = new palindromo(prueba);
		String resultado = pali.palin();
		String comprobar = "Adios lollol soidA";
		assertTrue(resultado.equals(comprobar));
	}
	
	@Test
	public void testTamaño50() {
		String prueba = "Programacion es una asignatura muy dura";
		pali = new palindromo(prueba);
		String resultado = pali.palin();
		String comprobar = "Programacion es una asignatura muy duraarud yum arutangisa anu se noicamargorP";
		assertTrue(resultado.equals(comprobar));
	}
	
	@Test
	public void testMayus() {
		String prueba = "ADIOS MUNDO";
		pali = new palindromo(prueba);
		String resultado = pali.palin();
		String comprobar = "ADIOS MUNDOODNUM SOIDA";
		assertTrue(resultado.equals(comprobar));
	}
	
}
