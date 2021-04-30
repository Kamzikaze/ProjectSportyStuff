package windowBuilderStuff;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import ourCode.Athlete;
import ourCode.Man;
import ourCode.Woman;

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
		//Thread.sleep(5000);
		lsw.loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//something happens here
			}
		});
	}
	
	public void pressSignupButton() throws InterruptedException
	{
		//Thread.sleep(5000);
		lsw.signupBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				runSignupWindow();
			}
		});
	}
	
	public void printParticipants()
	{
		for (Athlete athlete : athletes) {
			if(athlete.getClass() == Woman.class)
			{
				System.out.println("Name: "+ athlete.firstName + " " + athlete.lastName + " Heptathlon");
			}
			if(athlete.getClass() == Man.class)
			{
				System.out.println("Name: "+ athlete.firstName + " " + athlete.lastName + " Decathlon");
			}
			
		}
		
		
	}

	
	
	

}



