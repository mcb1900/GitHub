package GitHub;

import java.util.Scanner;

public class AdivinarNumeroConAyuda {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Generar número aleatorio entre 1 y 100
		
		//bucle del juego
			//leer un numero
			//comparar numero con aleatorio
		int secreto = (int)(Math.random() * 100) + 1;
		int valor;
		boolean repetir = true;
		int cont = 0;
		do{
			System.out.print("Dime un número de 1 al 100(0 = salir): ");
			 valor = teclado.nextInt();
			if(valor == 0){
				System.out.println("El número esa el: " + secreto);
				repetir = false;
		}else{
			cont = cont + 1;
		
			if(valor == secreto){
				System.out.println("¡Enhorabuena!");
			repetir = false;
		}else{
				if(valor > secreto)
					System.out.println("El valor es menor");
				else
					System.out.println("El valor es mayor");
		}
			
		}	
		
		}while (repetir);
		
		if (valor == 0)
			System.out.println("Hasta luego");
		else{
			if ( cont <= 3)
				System.out.println("¡Impresionante!");
			else
				if (cont <= 8)
					System.out.println("Podrias hacerlo mejor");
				else
					System.out.println("Un mal dia lo tiene cualquiera");
		}
		teclado.close();
		}
	
		
	}
	
