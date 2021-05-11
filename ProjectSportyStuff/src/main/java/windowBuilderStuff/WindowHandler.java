package windowBuilderStuff;

import java.util.ArrayList;

import ourCode.*;

public class WindowHandler {

	public LoginSignupWindow lsw;
	public LoginWindow lw;
	public SignupWindow sw;
	public UserAddedWindow uaw;
	public DecathlonResultWindow drw;
	public HeptathlonResultWindow hrw;
	public ArrayList<Athlete> athletes;

	public int currID;

	public WindowHandler() {

		// initialize();
		System.out.println("new windowhandler");
	}

	public void initialize() {
		athletes = new ArrayList<Athlete>();
		// lsw = new LoginSignupWindow();
		// sw = new SignupWindow();
		// lw = new LoginWindow();
		// uaw = new UserAddedWindow();
		// drw = new DecathlonResultWindow();
		// hrw = new HeptathlonResultWindow();
		currID = 1;
		System.out.println("windowhandler init run");
	}

	public void addAthlete(Athlete a) {
		athletes.add(a);
		currID++;
	}

	public void runLoginSignupWindow() {

		System.out.println("Opening login/sign up window...");
		lsw = new LoginSignupWindow();
		lsw.startWindow();
	}

	public void runSignupWindow() {
		System.out.println("Opening SIGN UP window...");
		// lsw.closeWindow();
		sw = new SignupWindow();
		sw.startWindow();
	}

	public void runLoginWindow() {
		System.out.println("Opening LOGIN window...");
		// lsw.closeWindow();
		lw = new LoginWindow();
		lw.startWindow();
	}

	public void runUserAddedWindow() {
		System.out.println("Opening USER ADDED window...");
		// sw.closeWindow();
		uaw = new UserAddedWindow();
		uaw.startWindow();
	}

	public void runDecathlonWindow() {
		System.out.println("Opening DECATHLON window...");
		// uaw.closeWindow();
		// lw.closeWindow();
		drw = new DecathlonResultWindow();
		drw.startWindow();
	}

	public void runHeptathlonWindow() {
		System.out.println("Opening HEPTATHLON window...");
		// uaw.closeWindow();
		// lw.closeWindow();
		hrw = new HeptathlonResultWindow();
		hrw.startWindow();
	}

	public void printParticipants() {
		for (Athlete athlete : athletes) {
			if (athlete.getClass() == Woman.class) {
				System.out.println(
						"ID: " + athlete.ID + " Name: " + athlete.firstName + " " + athlete.lastName + " Heptathlon");
			}
			if (athlete.getClass() == Man.class) {
				System.out.println(
						"ID: " + athlete.ID + " Name: " + athlete.firstName + " " + athlete.lastName + " Decathlon");
			}

		}

	}

	public boolean isParticipantMale(int id) {
		for (Athlete athlete : athletes) {
			if (athlete.ID == id) {
				if (athlete.getClass() == Woman.class) {
					return false;
				}
				if (athlete.getClass() == Man.class) {
					return true;
				}

			}

		}

		return true;

	}

	public Athlete getLastAthlete() {
		return athletes.get(athletes.size());
	}

}
