package windowBuilderStuff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import ourCode.*;

public class WindowHandler {

	public LoginSignupWindow lsw;
	public SignupWindow sw;
	public ArrayList<Athlete> athletes;
	
	
	public WindowHandler() {
		lsw = new LoginSignupWindow();
		sw = new SignupWindow();
		athletes = new ArrayList<Athlete>();
	}
	
	public void addAthlete(Athlete a)
	{
		athletes.add(a);
	}
	
	public void runLoginSignupWindow()
	{
		System.out.println("Opening login/sign up window...");
		lsw.startWindow();
	}
	
	public void runSignupWindow()
	{
		System.out.println("Opening sign up window...");
		lsw.closeWindow();
		sw.startWindow();
	}
	
	public void runEnterResultWindow()
	{
		System.out.println("Opening result window...");
	}
	
	public void pressLoginButton() throws InterruptedException
	{
		
	}
	
	public void pressSignupButton() throws InterruptedException
	{
		
	}
	
	public void printParticipants()
	{
		for (Athlete athlete : athletes) {
			if(athlete.getClass() == Woman.class)
			{
				System.out.println("ID: " + athlete.ID + " Name: "+ athlete.firstName + " " + athlete.lastName + " Heptathlon");
			}
			if(athlete.getClass() == Man.class)
			{
				System.out.println("ID: " + athlete.ID + " Name: "+ athlete.firstName + " " + athlete.lastName + " Decathlon");
			}
			
		}
		
		
	}

	
	
	

}



