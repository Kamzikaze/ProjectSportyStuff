package ourCode;

public class Woman extends Athlete {

	int twohundredM;
	int eighthundredM;
	int onehundredMHurdles;
	int highJump;
	int longJump;
	int shotPut;
	int javelinThrow;

	public Woman(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = id;
	}

	public Woman() {
		// TODO Auto-generated constructor stub
	}

	public int getTwohundredM() {
		return twohundredM;
	}

	public void setTwohundredM(int twohundredM) {
		this.twohundredM = twohundredM;
	}

	public double getEighthundredM() {
		return eighthundredM;
	}

	public void setEighthundredM(int eighthundredM) {
		this.eighthundredM = eighthundredM;
	}

	public int getOnehundredMHurdles() {
		return onehundredMHurdles;
	}

	public void setOnehundredMHurdles(int onehundredMHurdles) {
		this.onehundredMHurdles = onehundredMHurdles;
	}

	public int getHighJump() {
		return highJump;
	}

	public void setHighJump(int highJump) {
		this.highJump = highJump;
	}

	public int getLongJump() {
		return longJump;
	}

	public void setLongJump(int longJump) {
		this.longJump = longJump;
	}

	public int getShotPut() {
		return shotPut;
	}

	public void setShotPut(int shotPut) {
		this.shotPut = shotPut;
	}

	public int getJavelinThrow() {
		return javelinThrow;
	}

	public void setJavelinThrow(int javelinThrow) {
		this.javelinThrow = javelinThrow;
	}

	public int getTotalResult() {
		return twohundredM + eighthundredM + onehundredMHurdles + highJump + longJump + shotPut + javelinThrow;
	}

}
