package ETS;

import java.util.Scanner;

public class UsoDebuger {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un n�mero: ");
		double n1 = teclado.nextDouble();
		System.out.println("Dime otro n�mero: ");
		double n2 = teclado.nextDouble();
		System.out.println("Dime otro n�mero: ");
		double n3 = teclado.nextDouble();
		
		double media = (n1 + n2 + n3)/ 3;
		System.out.println("La media aritm�tica es: " + media);

		teclado.close();
	}

}
