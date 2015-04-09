package examen2eval2;

public class Capicua {
	private int num;
	
	public Capicua(int num) {
		this.num = num;
	}
	
	public int Inverso() {
		
		int r, s = 0, k;
		k = num;
		while ( num != 0) {
			r = num % 10;
			s = s * 10 + r;
			num = num / 10;
		}
		
		return (s);
	}
	

}
