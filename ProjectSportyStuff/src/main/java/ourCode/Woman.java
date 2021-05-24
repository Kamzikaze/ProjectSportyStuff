package ourCode;

public class Woman extends Athlete {

	double twohundredM;
	double eighthundredM;
	double onehundredMHurdles;
	double highJump;
	double longJump;
	double shotPut;
	double javelinThrow;

	public Woman(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = id;
	}

	public double getTwohundredM() {
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

	public double getOnehundredMHurdles() {
		return onehundredMHurdles;
	}

	public void setOnehundredMHurdles(int onehundredMHurdles) {
		this.onehundredMHurdles = onehundredMHurdles;
	}

	public double getHighJump() {
		return highJump;
	}

	public void setHighJump(int highJump) {
		this.highJump = highJump;
	}

	public double getLongJump() {
		return longJump;
	}

	public void setLongJump(int longJump) {
		this.longJump = longJump;
	}

	public double getShotPut() {
		return shotPut;
	}

	public void setShotPut(int shotPut) {
		this.shotPut = shotPut;
	}

	public double getJavelinThrow() {
		return javelinThrow;
	}

	public void setJavelinThrow(int javelinThrow) {
		this.javelinThrow = javelinThrow;
	}

	public double getTotalResult() {
		return twohundredM + eighthundredM + onehundredMHurdles + highJump + longJump + shotPut + javelinThrow;
	}

}
