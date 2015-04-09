package ETS;

import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		
		double longitud;
		double radio;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Radio: ");
		radio=(double) sc.nextDouble();
		longitud= (double) (2 * 3.1416 * radio);
		System.out.println("Longitud: " + longitud);
		sc.close();
	}

}
