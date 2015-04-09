package examen2eval2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCapicua {
	
	static Capicua capi;
	private int num;
	
	@Before
	public void Cargar() {
		capi = new Capicua(22);
	}
	
	@Test
	public void par() {
		int prueba = 2442;
		capi = new Capicua(prueba);
		int num = capi.Inverso();
		assertTrue(num == prueba);
		
	}
	 @Test
	public void impar() {
		 int prueba = 2485842;
		capi = new Capicua(prueba);
		int num = capi.Inverso();
		assertTrue(num == prueba);
	}
	@Test
	public void cero() {
		int prueba = 0;
		capi = new Capicua(prueba);
		int num = capi.Inverso();
		assertTrue(num == prueba);
	}
	@Test
	public void negativo() {
		int prueba = -585;
		capi = new Capicua(prueba);
		int num = capi.Inverso();
		assertTrue(num == prueba);
	}

	@Test
	public void ErrorControlado() {
		int prueba = 2354644;
		capi = new Capicua(prueba);
		int num = capi.Inverso();
		assertTrue(num == prueba);
	}
}
