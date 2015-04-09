package ETS;

import java.util.Scanner;

public class UseDebuger {

	public static void main(String[] args) {
		
		Scanner lol = new Scanner(System.in);

		System.out.print("Dime un numero: ");
		double a = lol.nextDouble();
		
		System.out.print("Dime otro numero: ");
		double b = lol.nextDouble();
		
		double suma = a + b;
				
		System.out.print("La suma es: " + suma);
		
		lol.close();
	}

}
