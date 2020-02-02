package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import step_definitions.step_impl.AdventurePage_impl;

public class AdventurePage_STEPS {

    AdventurePage_impl adventure_impl = new AdventurePage_impl();

    @When("User navigates to {string} page")
    public void user_navigates_to_page(String page) {
        adventure_impl.navigateToPage(page);
    }

    @Then("Verifies Adventures under {int}")
    public void verifies_Adventures_under(Integer int1) {
        for (int n : adventure_impl.checkPrice())
            Assert.assertTrue(n < int1);
    }

}
