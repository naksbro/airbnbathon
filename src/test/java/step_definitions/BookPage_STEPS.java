package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BookPage;
import pages.HomePage;
import step_definitions.step_impl.BookPage_impl;
import step_definitions.step_impl.HomePage_impl;
import util.Driver;

public class BookPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    BookPage bookPage = new BookPage();
    BookPage_impl bookPage_impl = new BookPage_impl();

    @When("User enters {string}, checks in today, checks out in a week, and enters {string} guests")
    public void user_enters_checks_in_today_checks_out_in_week_and_enters_guests(String location, String guests) {
        bookPage_impl.bookNow(location,guests);
    }

    @Then("Verify search parameters are correct")
    public void verify_search_paramaters_are_correct() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
