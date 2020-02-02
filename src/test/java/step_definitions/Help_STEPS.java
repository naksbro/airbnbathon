package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HelpHomePage;
import util.Driver;

public class Help_STEPS {
    private static WebDriver driver = Driver.getDriver();
    HelpHomePage helpHomePage = new HelpHomePage();

    @Then("User Select first popular article")
    public void user_Select_first_popular_article() {
        Assert.assertEquals("Home - Airbnb Help Center", driver.getTitle());
      //   Assert.assertEquals("Coronavirus information and extenuating circumstances policy".driver.getTaitle);
    }

}
