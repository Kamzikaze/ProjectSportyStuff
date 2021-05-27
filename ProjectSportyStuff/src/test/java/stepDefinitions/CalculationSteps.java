package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ourCode.Calculation;
import static org.junit.Assert.assertEquals;

	public class CalculationSteps {
		
		private Calculation calc;
		String chosenEvent;
		int myResult;
		
		@Given("I have chosen {string}")
		public void i_have_chosen(String event) {
			calc = new Calculation();
			chosenEvent = event;
		}
		
		@When("I enter the {double} for decathlon")
		public void i_enter_the_for_decathlon(double result) {
			myResult = calc.CalculateDecathlonResult(result, chosenEvent);
			}
		
		@When("I enter the {double} for heptathlon")
		public void i_enter_the_for_heptathlon(double result) {
			myResult = calc.CalculateHeptathlonResult(result, chosenEvent);
			}


		@Then("I get the {int} for {double} and {string}")
		public void i_get_the_for_and(int points, double result, String event) {
			assertEquals(points, myResult);
	}

}