package ourCode;

public class Man extends Athlete {

	double onehundredM;
	double longJump;
	double shotPut;
	double highJump;
	double fourhundredM;
	double onehundredtenMHurdles;
	double discusThrow;
	double poleVault;
	double javelinThrow;
	double onethousandfivehundredM;

	public Man(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = id;
	}

	public double getOnehundredM() {
		return onehundredM;
	}

	public void setOnehundredM(int onehundredM) {
		this.onehundredM = onehundredM;
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

	public double getHighJump() {
		return highJump;
	}

	public void setHighJump(int highJump) {
		this.highJump = highJump;
	}

	public double getFourhundredM() {
		return fourhundredM;
	}

	public void setFourhundredM(int fourhundredM) {
		this.fourhundredM = fourhundredM;
	}

	public double getOnehundredtenMHurdles() {
		return onehundredtenMHurdles;
	}

	public void setOnehundredtenMHurdles(int onehundredtenMHurdles) {
		this.onehundredtenMHurdles = onehundredtenMHurdles;
	}

	public double getDiscusThrow() {
		return discusThrow;
	}

	public void setDiscusThrow(int discusThrow) {
		this.discusThrow = discusThrow;
	}

	public double getPoleVault() {
		return poleVault;
	}

	public void setPoleVault(int poleVault) {
		this.poleVault = poleVault;
	}

	public double getJavelinThrow() {
		return javelinThrow;
	}

	public void setJavelinThrow(int javelinThrow) {
		this.javelinThrow = javelinThrow;
	}

	public double getOnethousandfivehundredM() {
		return onethousandfivehundredM;
	}

	public void setOnethousandfivehundredM(int onethousandfivehundredM) {
		this.onethousandfivehundredM = onethousandfivehundredM;
	}

	public double getTotalResult() {
		return onehundredM + longJump + shotPut + highJump + fourhundredM + onehundredtenMHurdles + discusThrow
				+ poleVault + javelinThrow + onethousandfivehundredM;
	}

}
