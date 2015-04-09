package ETS2;

public class palindromo {
	private String pal = new String ();
	
	public palindromo(String pal) {
		this.pal = pal;
	}

	
	public String palin() {
			
		char[] vec = new char[pal.length()];
			
		for (int i=0; i<pal.length(); i++) 
			vec[(vec.length - 1) - i] = pal.charAt(i);
			
		String nueva = new String(vec);
			
		String fin = pal + nueva;
			
		return fin;
	}
	
}