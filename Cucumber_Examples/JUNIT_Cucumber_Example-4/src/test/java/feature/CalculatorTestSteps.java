package feature;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import com.capgemini.CucumberEx4.Add.Calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorTestSteps {

	 private int total;
	 
	    private Calculator calculator;
	 
	    @Before
	    private void init() {
	        total = -999;
	    }
	 
	    @Given("^I have a calculator$")
	    public void initializeCalculator() throws Throwable {
	        calculator = new Calculator();
	    }
	 
	    @When("^I add (-?\\d+) and (-?\\d+)$")
	    public void testAdd(int num1, int num2) throws Throwable {
	        total = calculator.add(num1, num2);
	    }
	 
	    @Then("^the result should be (-?\\d+)$")
	    public void validateResult(int result) throws Throwable {
	        assertThat(total, equalTo(result));
	    }
}
