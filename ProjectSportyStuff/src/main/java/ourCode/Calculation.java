package ourCode;

public class Calculation {

	double A;
	double B;
	double C;
	double BP;
	double PB;

	public Calculation() {

	}

	// �Points =INT(A(B�P)^C)for track events
	// �Points =INT(A(P�B)^C)for field events

	public int CalculateDecathlonResult(double P, String event) {

		int result = 0;

		if(P == 0.0)
			return 0;
		
		
		if (event.equalsIgnoreCase("100m")) {
			A = 25.4347;
			B = 18;
			C = 1.81;

			BP = B - P;

			double r = A * Math.pow(BP, C);

			String precut = Double.toString(r);

			System.out.println(event + precut);
			
			String rest = precut.substring(0, precut.indexOf("."));
			
			System.out.println(rest);

			result = Integer.parseInt(rest);


		}
		if (event.equalsIgnoreCase("long jump")) {
			A = 0.14354;
			B = 220;
			C = 1.4;

			PB = P - B;

			double r = A * Math.pow(PB, C);

			String precut = Double.toString(r);
			
			System.out.println(event + precut);	
			
			String rest = precut.substring(0, precut.indexOf("."));
			
			System.out.println(rest);

			result = Integer.parseInt(rest);
		}
		if (event.equalsIgnoreCase("shot put")) {
			A = 51.39;
			B = 1.5;
			C = 1.05;

			PB = P - B;

			double r = A * Math.pow(PB, C);

			String precut = Double.toString(r);

			System.out.println(event + precut);	
						
			String rest = precut.substring(0, precut.indexOf("."));
			
			System.out.println(rest);

			result = Integer.parseInt(rest);
		}
		if (event.equalsIgnoreCase("high jump")) {
			A = 0.8465;
			B = 75;
			C = 1.42;

			PB = P - B;

			double r = A * Math.pow(PB, C);

			String precut = Double.toString(r);

			System.out.println(event + precut);	
						
			String rest = precut.substring(0, precut.indexOf("."));
			
			System.out.println(rest);

			result = Integer.parseInt(rest);
		}
		if (event.equalsIgnoreCase("400m")) {
			A = 1.53775;
			B = 82;
			C = 1.81;

			BP = B - P;

			double r = A * Math.pow(BP, C);

			String precut = Double.toString(r);

			System.out.println(event + precut);	
						
			String rest = precut.substring(0, precut.indexOf("."));
			
			System.out.println(rest);

			result = Integer.parseInt(rest);
		}
		if (event.equalsIgnoreCase("110m hurdles")) {
			A = 5.74352;
			B = 28.5;
			C = 1.92;

			BP = B - P;

			double r = A * Math.pow(BP, C);

			String precut = Double.toString(r);

			System.out.println(event + precut);	
						
			String rest = precut.substring(0, precut.indexOf("."));
			
			System.out.println(rest);

			result = Integer.parseInt(rest);

		}
		if (event.equalsIgnoreCase("discus throw")) {
			A = 12.91;
			B = 4;
			C = 1.1;

			PB = P - B;

			double r = A * Math.pow(PB, C);

			String precut = Double.toString(r);

			System.out.println(event + precut);	
						
			String rest = precut.substring(0, precut.indexOf("."));
			
			System.out.println(rest);

			result = Integer.parseInt(rest);
		}
		if (event.equalsIgnoreCase("pole vault")) {
			A = 0.2797;
			B = 100;
			C = 1.35;

			PB = P - B;

			double r = A * Math.pow(PB, C);

			String precut = Double.toString(r);

			System.out.println(event + precut);	
						
			String rest = precut.substring(0, precut.indexOf("."));
			
			System.out.println(rest);

			result = Integer.parseInt(rest);
		}
		if (event.equalsIgnoreCase("javelin throw")) {
			A = 10.14;
			B = 7;
			C = 1.08;

			PB = P - B;

			double r = A * Math.pow(PB, C);

			String precut = Double.toString(r);

			System.out.println(event + precut);	
						
			String rest = precut.substring(0, precut.indexOf("."));
			
			System.out.println(rest);

			result = Integer.parseInt(rest);
		}
		if (event.equalsIgnoreCase("1500m")) {
			A = 0.03768;
			B = 480;
			C = 1.85;

			BP = B - P;

			double r = A * Math.pow(BP, C);

			String precut = Double.toString(r);

			System.out.println(event + precut);	
						
			String rest = precut.substring(0, precut.indexOf("."));
			
			System.out.println(rest);
			
			result = Integer.parseInt(rest);


		}
//		else {
//			System.out.println(event + " " + P + " failed, You have to select one of the shown options");
			//???
		//}

		return result;
	}

	public int CalculateHeptathlonResult(double P, String event) {
		int result = 0;

		if(P == 0.0)
			return 0;
		
		if (event.equalsIgnoreCase("200m")) {
			A = 4.99087;
			B = 42.5;
			C = 1.81;

			BP = B - P;

			double r = A * Math.pow(BP, C);

			String precut = Double.toString(r);

			String rest = precut.substring(0, precut.indexOf("."));

			result = Integer.parseInt(rest);

			System.out.println(precut);
			System.out.println(rest);

		}
		if (event.equalsIgnoreCase("800m")) {
			A = 0.11193;
			B = 254;
			C = 1.88;

			BP = B - P;

			double r = A * Math.pow(BP, C);

			String precut = Double.toString(r);

			String rest = precut.substring(0, precut.indexOf("."));

			result = Integer.parseInt(rest);

			System.out.println(precut);
			System.out.println(rest);

		}
		if (event.equalsIgnoreCase("100m hurdles")) {
			A = 9.23076;
			B = 26.7;
			C = 1.835;

			BP = B - P;

			double r = A * Math.pow(BP, C);

			String precut = Double.toString(r);

			String rest = precut.substring(0, precut.indexOf("."));

			result = Integer.parseInt(rest);

			System.out.println(precut);
			System.out.println(rest);

		}
		if (event.equalsIgnoreCase("high jump")) {
			A = 1.84523;
			B = 75;
			C = 1.348;

			PB = P - B;

			double r = A * Math.pow(PB, C);

			String precut = Double.toString(r);

			String rest = precut.substring(0, precut.indexOf("."));

			result = Integer.parseInt(rest);
		}
		if (event.equalsIgnoreCase("long jump")) {
			A = 0.188807;
			B = 210;
			C = 1.41;

			PB = P - B;

			double r = A * Math.pow(PB, C);

			String precut = Double.toString(r);

			String rest = precut.substring(0, precut.indexOf("."));

			result = Integer.parseInt(rest);
		}
		if (event.equalsIgnoreCase("shot put")) {
			A = 56.0211;
			B = 1.5;
			C = 1.05;

			PB = P - B;

			double r = A * Math.pow(PB, C);

			String precut = Double.toString(r);

			String rest = precut.substring(0, precut.indexOf("."));

			result = Integer.parseInt(rest);
		}
		if (event.equalsIgnoreCase("javelin throw")) {
			A = 15.9803;
			B = 3.8;
			C = 1.04;

			PB = P - B;

			double r = A * Math.pow(PB, C);

			String precut = Double.toString(r);

			String rest = precut.substring(0, precut.indexOf("."));

			result = Integer.parseInt(rest);
		}

//		else {
//			System.out.println("You have to select one of the shown options");
//			///???
//		}
		
			return result;
	}

}
