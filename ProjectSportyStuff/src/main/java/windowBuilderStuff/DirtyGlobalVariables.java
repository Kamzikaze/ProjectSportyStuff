package windowBuilderStuff;

import java.io.File;

import ourCode.Athlete;

public class DirtyGlobalVariables {

	public static enum Status {
		LOGINSIGNUPlogin, LOGINSIGNUPsignup, SIGNUPnext, SIGNUPcancel, USERADDEDregisterresult, USERADDEDexit,
		LOGINlogin, LOGINcancel, RESULTsave, RESULTcancel
	}
	
	public static boolean runFromTestRunner = false;

	public static Athlete stAthlete = new Athlete();
	
	public static int currID = 0;
	public static Status currStatus = Status.LOGINSIGNUPlogin;

	public static WindowHandler windowHandler = createWindowHandler();

	public DirtyGlobalVariables() {

	}

	private static WindowHandler createWindowHandler() {
		WindowHandler tmp = null;
		try {
			tmp = new WindowHandler();
		} catch (Exception uhe) {
			System.out.println("failed" + uhe.getMessage());
		}
		return tmp;

	}

	public static WindowHandler _windowHandler() {
		return windowHandler;
	}

	public static void setStatus(String status) {
		for (Status status1 : Status.values()) {
			if (status1.toString().equalsIgnoreCase(status)) {
				currStatus = status1;
				System.out.println("current status is: " + currStatus);
			}
		}
	}
	
	public static boolean isThisANumber(String str)
	{
		double d;
		try {
			d = Double.parseDouble(str);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

		return true;
	}
	
}
