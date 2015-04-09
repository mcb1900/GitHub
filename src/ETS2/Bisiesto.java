package ETS2;

public class Bisiesto {
		private int b;
		
		public Bisiesto(int r) {
			this.b = r;
		}
		public int año() {
			if (b % 4 == 0 && (b % 100 != 0 || b % 400 == 0)) 	
		      return 1;
			
			return 0;


	}

}
