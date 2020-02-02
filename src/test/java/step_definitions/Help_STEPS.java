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

    @Then("Verifies title of article")
    public void verifies_title_of_article() {
        Assert.assertEquals("Coronavirus information and extenuating circumstances policy", helpHomePage.Verifies_Coronavirus_Title.getText());
    }

}
