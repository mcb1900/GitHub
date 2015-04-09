package ETS;

import java.util.Scanner;

public class DivisionETS {

	public static void main(String[] args) {
		int numerador, denominador, resultado = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el numerador: ");
		numerador = teclado.nextInt();
		System.out.print("Introduce el denominador: ");
		denominador = teclado.nextInt();
		resultado = numerador/denominador;
		teclado.close();
		System.out.print("El resultado es: " + resultado);
	}

}
