package ETS2;

import java.util.Scanner;

public class PalindromoMalo {
		private String cosasQuitar = " ,.-'?¿!¡";
		
		for (int i1=0; i<cosasQuitar.length(); i++) {
			char letraQuitar = cosasQuitar.charAt(i1);
			String quitar = Character.toString(letraQuitar);
			String frase = frase.replace(quitar, "");
		}
			
		frase = frase.replace("á", "a");
		frase = frase.replace("é", "e");
		frase = frase.replace("í", "i");
		frase = frase.replace("ó", "o");
		frase = frase.replace("ú", "u");
		
		String fraseInvertida = "";

		private String frase;
		for (int i=frase.length()-1; i >= 0; i--)
			fraseInvertida = fraseInvertida + frase.charAt(i);
		
		
		
		
	}

}
