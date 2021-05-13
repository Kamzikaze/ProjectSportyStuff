package ourCode;

public class Register {

	int currentID;

	public Register() {
		currentID = 0;
	}

	public int giveUniqueID() {
		int id = currentID + 1;
		currentID = id;

		return id;
	}

}
