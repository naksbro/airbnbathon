package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class BecomeHostPage {
    private static WebDriver driver = Driver.getDriver();
    public BecomeHostPage(){
        PageFactory.initElements(driver,this);
    }
    HomePage homePage = new HomePage();

    @FindBy(xpath = "//div[text()='Host a home']")
    public WebElement Hostahome_btn;
}