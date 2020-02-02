package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BookPage;
import pages.HomePage;
import step_definitions.step_impl.BookPage_impl;
import step_definitions.step_impl.HomePage_impl;
import util.Driver;

public class BookPage_STEPS {
    private WebDriver driver = Driver.getDriver();
    BookPage bookPage = new BookPage();
    BookPage_impl bookPage_impl = new BookPage_impl();

    @When("User enters {string}, checks in tomorrow, checks out in a week, and enters {string} guests")
    public void user_enters_checks_in_today_checks_out_in_week_and_enters_guests(String location, String guests) {
        bookPage_impl.bookNow(location,guests);
    }

    @Then("Verify {string} is searched")
    public void verify_is_searched(String location) {
        Assert.assertEquals(bookPage.textVerif.getText(),"Explore The "+ location);
    }
}
