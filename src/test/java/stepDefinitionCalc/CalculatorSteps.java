package stepDefinitionCalc;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private CalculatorMain calc;

    double a;
    double b;
    double result;

    @Given("две цифры (\\d) и (\\d)")
    public void given(double a, double b) {
        this.a = a;
        this.b = b;
        this.calc = new CalculatorMain();
    }

    @When("ищем сумму двух цифр")
   public void when() {
        result = calc.sum(a,b);
    }

    @Then("результат должен быть (\\d)")
    public void then(double res) {
        assertEquals(res,result,0.0001);
    }
}
