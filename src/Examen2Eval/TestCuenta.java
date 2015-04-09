package Examen2Eval;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestCuenta {
	
	static Cuenta cuenta;
	private double saldo;
	private String numcuenta;
	
	
@Before
public void Cargar() {
	cuenta = new Cuenta("lol", 4000);

}
	
@Test
public void Ingresarsaldo1() {
	
	cuenta = new Cuenta("lol", 4000);
	double cantidad = cuenta.Deposito(2500);
	assertTrue(cantidad ==6500);
	
}

@Test
public void Ingresarsaldo2() {
	
	cuenta = new Cuenta("lol", 4000);
	double cantidad = cuenta.Deposito(50.25);
	assertTrue(cantidad ==4050.25);
	
}

@Test
public void Retirarsaldo1() {
	
	cuenta = new Cuenta("lol", 4000);
	double cantidad = cuenta.Retiro(1000);
	assertTrue(cantidad == 3000);
}

@Test
public void Retirarsaldo2() {
	
	//Error controlado
	cuenta = new Cuenta("lol", 4000);
	double cantidad = cuenta.Deposito(5000);
	assertTrue(cantidad ==7000);
}

	
}