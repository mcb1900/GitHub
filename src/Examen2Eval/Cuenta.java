package Examen2Eval;

public class Cuenta {
	private String numcuenta;
	private double balance;
	
	public Cuenta(String cc, double saldo){
		this.numcuenta=cc;
		this.balance=saldo;
	}
	
	public double Deposito(double cantidad){
		balance += cantidad;
		return balance;
	}

	public double Retiro(double cantidad){
		if (balance >= cantidad){
			balance -= cantidad;
			return balance;
		}else
			return -1;
	}
}
