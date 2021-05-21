package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ourCode.Calculation;

public class CalculationSteps {
	
	@Given("I have chosen {string} as an event")
	public void i_have_chosen_as_an_event(String event) {
		Calculation chooseEvent = new Calculation();
		//chooseEvent.CalculateDecathlonResult(0, event);
		//chooseEvent.CalculateHeptathlonResult(0, event);
	}
	@When("I enter the (.*) as a result")
	public void i_enter_the_as_a_result(double result) {
		Calculation enterResult = new Calculation();
		//enterResult.CalculateDecathlonResult(result, null);
		//enterResult.CalculateHeptathlonResult(result, null);
	}

	@Then("I get the (.*) for (.*) and {string}")
	public void i_get_the_score_for_result_and_event(String score) {
		// TODO
	}
}
