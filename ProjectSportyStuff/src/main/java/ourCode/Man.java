package ourCode;

public class Man extends Athlete{

<<<<<<< HEAD
=======
	int onehundredM;
	int longJump;
	int shotPut;
	int highJump;
	int fourhundredM;
	int onehundredtenMHurdles;
	int discusThrow;
	int poleVault;
	int javelinThrow;
	int onethousandfivehundredM;
	
	
>>>>>>> refs/heads/master
	public Man(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = id;
	}


	public int getOnehundredM() {
		return onehundredM;
	}


	public void setOnehundredM(int onehundredM) {
		this.onehundredM = onehundredM;
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


	public int getHighJump() {
		return highJump;
	}


	public void setHighJump(int highJump) {
		this.highJump = highJump;
	}


	public int getFourhundredM() {
		return fourhundredM;
	}


	public void setFourhundredM(int fourhundredM) {
		this.fourhundredM = fourhundredM;
	}


	public int getOnehundredtenMHurdles() {
		return onehundredtenMHurdles;
	}


	public void setOnehundredtenMHurdles(int onehundredtenMHurdles) {
		this.onehundredtenMHurdles = onehundredtenMHurdles;
	}


	public int getDiscusThrow() {
		return discusThrow;
	}


	public void setDiscusThrow(int discusThrow) {
		this.discusThrow = discusThrow;
	}


	public int getPoleVault() {
		return poleVault;
	}


	public void setPoleVault(int poleVault) {
		this.poleVault = poleVault;
	}


	public int getJavelinThrow() {
		return javelinThrow;
	}


	public void setJavelinThrow(int javelinThrow) {
		this.javelinThrow = javelinThrow;
	}


	public int getOnethousandfivehundredM() {
		return onethousandfivehundredM;
	}


	public void setOnethousandfivehundredM(int onethousandfivehundredM) {
		this.onethousandfivehundredM = onethousandfivehundredM;
	}

	public int getTotalResult()
	{
		return onehundredM + longJump + shotPut + highJump + fourhundredM + onehundredtenMHurdles + discusThrow + poleVault + javelinThrow + onethousandfivehundredM;
	}
	
}
