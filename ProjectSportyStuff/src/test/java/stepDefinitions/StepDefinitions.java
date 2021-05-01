package stepDefinitions;

import java.util.Random;
import java.util.Scanner;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ourCode.Athlete;

public class StepDefinitions {

	Scanner scan;
	String s;

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
		
		
		
	}

	@When("the user gets a unique id")
	public void the_user_gets_a_unique_id() {
		
		System.out.println("Your unique ID is: " + Math.random());
		
		
		
	}

	@Then("the user is registered")
	public void the_user_is_registered() {
		
		System.out.println("Your user has been registered.");
		
	}

}
