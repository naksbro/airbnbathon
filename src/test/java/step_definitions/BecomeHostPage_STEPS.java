package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import step_definitions.step_impl.HomePage_impl;
import util.Driver;

public class BecomeHostPage_STEPS {
    private static WebDriver driver= Driver.getDriver();



    @When("User navigates to {string} page")
    public void user_navigates_to_page(String string) {
        HomePage_impl homePage_impl=new HomePage_impl();
        homePage_impl.getTitle();

    }

}
