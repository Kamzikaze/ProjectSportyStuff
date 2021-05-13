package ourCode;

public class Register {
	
	int currentID;

	public Register() {
		currentID = 0;
	}

	public int giveUniqueID()
	{
		int id = currentID+1;
		currentID = id;
		
		return id;
	}
	
	Athlete[] contestant = new Athlete[40]; {
	contestant[0] = new Athlete();
	}
	 Athlete[] constestant = new Athlete[40]; {
	for (int i = 0; i < 40; i++) {
	contestant[i] = new Athlete();
	}
}
}
