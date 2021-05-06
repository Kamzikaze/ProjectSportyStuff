package ourCode;

public class Contestants {
		
		public static void main (String[] args) {
		Contestants[] contestant = new Contestants[40];
	    contestant[0] = new Contestants();

	    Contestants[] constestant = new Contestants[40];
	    for (int i = 0; i < 40; i++) {
	        contestant[i] = new Contestants();
	        System.out.println(i);
	    }
	    System.out.println(contestant);
	}
}