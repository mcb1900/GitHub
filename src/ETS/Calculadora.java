package ETS;



public class Calculadora {
	private double a;
	private double b;
	public Calculadora(int a, int b) {
		this.a = a;
		this.b = b;
	}
public double suma() {
	return a + b;
}
public double resta() {
	return a - b;
}
public double multiplica() {
	return a * b;
}
public double divide() {
	return a / b;
}
}

