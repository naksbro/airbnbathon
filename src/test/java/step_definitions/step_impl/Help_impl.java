package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.HelpHomePage;
import pages.HomePage;
import util.Driver;

public class Help_impl {

    private static WebDriver driver = Driver.getDriver();
     HelpHomePage helpHomePage = new HelpHomePage();

    public String getTitle(){
        return driver.getTitle();
    }
}
