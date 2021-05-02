package windowBuilderStuff;

public class DirtyGlobalVariables {
	
	public static enum Status {
		LOGINSIGNUPlogin, 
		LOGINSIGNUPsignup,
		SIGNUPnext,
		SIGNUPcancel,
		USERADDEDregisterresult,
		USERADDEDexit,
		LOGINlogin,
		LOGINcancel,
		RESULTsave,
		RESULTcancel
		}


	public static int currID = 0;
	public static Status currStatus = Status.LOGINSIGNUPlogin;
	public static WindowHandler _windowHandler = new WindowHandler();
	
	
	public DirtyGlobalVariables() {
		
	} 

	public static void setStatus(String status)
	{
		for (Status status1 : Status.values()) {
			if(status1.toString().equalsIgnoreCase(status))
			{
				currStatus = status1;
				System.out.println("current status is: " + currStatus);
			}
		}
	}
}
