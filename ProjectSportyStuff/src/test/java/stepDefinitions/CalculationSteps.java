	package stepDefinitions;

	import static org.junit.Assert.assertEquals;

import java.util.Scanner;

    import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import ourCode.Calculation;
	public class CalculationSteps {
		
		private Calculation calc;
		Scanner scan = new Scanner(System.in);
		
		@Given("I have chosen {string}")
		public void i_have_chosen(String event) {
			calc = new Calculation();
			event = scan.nextLine();
			
			//calc.CalculateDecathlonResult(0, event);
			//calc.CalculateHeptathlonResult(0, event);
		}
		
		@When("I enter the {double}")
		public void i_enter_the(double result) {
			calc.CalculateDecathlonResult(result, null);
			calc.CalculateHeptathlonResult(result, null);
			

		}

		@Then("I get the {double} for {int} and {string}")
		public void i_get_the_for_and(String score) {
			assertEquals(score, calc.CalculateDecathlonResult(0, score));
			assertEquals(score, calc.CalculateHeptathlonResult(0, score));
		}
	}



