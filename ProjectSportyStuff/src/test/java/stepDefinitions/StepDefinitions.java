package stepDefinitions;

import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ourCode.Athlete;
import windowBuilderStuff.*;

public class StepDefinitions {

	String pressedButton;
	
	WindowHandler windowHandler;
	//LoginSignupWindow lsw;
	Scanner scan;
	String s;


	@Given("the user enters the program")
	public void the_user_enters_the_program() {
		// this is where gui loads
	}

	@Given("I run the program")
	public void i_run_the_program() {
		windowHandler = new WindowHandler();
		//windowHandler.runLoginSignupWindow();
		System.out.println("Before...");
	}



	@Given("the two alternatives is displayed\\(Decathlon or heptathlon)")
	public void the_two_alternatives_is_displayed_decathlon_or_heptathlon() {
		System.out.println("type d for decathlon or h for heptathlon");
	}

	@When("User chooses one of the programs")
	public void user_chooses_one_of_the_programs() {
		scan = new Scanner(System.in);
		s = scan.next();
	}

	@Then("the program displays the different sports depending on the option")
	public void the_program_displays_the_different_sports_depending_on_the_option() {
		if (s.equalsIgnoreCase("d")) {
			System.out.println("you have chosen decathlon");
		}
		if (s.equalsIgnoreCase("h")) {
			System.out.println("you have chosen heptathlon");
		}
	}

	@Given("User has a value to enter")
	public void user_has_a_value_to_enter() {

	}

	@When("User inputs values")
	public void user_inputs_values() {

	}

	@Then("The values is saved")
	public void the_values_is_saved() {

	}

	@Given("user enters first name and lastname")
	public void user_enters_first_name_and_lastname() {
		scan = new Scanner(System.in);
		String firstName;
		String lastName;

		System.out.println("What is your first name?");
		firstName = scan.next();

		System.out.println("What is your last name?");
		lastName = scan.next();
<<<<<<< HEAD
		
=======

>>>>>>> refs/heads/master
	}

	@When("the user gets a unique id")
	public void the_user_gets_a_unique_id() {

		System.out.println("Your unique ID is: " + Math.random());
<<<<<<< HEAD
		
=======

>>>>>>> refs/heads/master
	}

	@Then("the user is registered")
	public void the_user_is_registered() {

		System.out.println("Your user has been registered.");

	}

	@Given("I press login")
	public void i_press_login() throws InterruptedException {
		//windowHandler.pressLoginButton();
		pressedButton = "login";
	}

	@Then("A new window opens")
	public void a_new_window_opens() {
		
		if(pressedButton.equalsIgnoreCase("login"))
			System.out.println("Logging in...");
		if(pressedButton.equalsIgnoreCase("signup"))
			System.out.println("Signing up...");
	}

	@Given("I press sign up")
	public void i_press_sign_up() throws InterruptedException {
		//windowHandler.pressSignupButton();
		pressedButton = "signup";
	}

}
