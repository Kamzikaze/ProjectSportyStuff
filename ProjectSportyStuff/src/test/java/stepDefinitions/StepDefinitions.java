package stepDefinitions;

import java.util.Scanner;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	Scanner scan;
	String s;

	@Given("the user enters the program")
	public void the_user_enters_the_program() {
		// this is where gui loads
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
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User inputs values")
	public void user_inputs_values() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The values is saved")
	public void the_values_is_saved() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
}
