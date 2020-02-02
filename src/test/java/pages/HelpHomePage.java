package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class HelpHomePage {

    private WebDriver driver = Driver.getDriver();
    public HelpHomePage() {
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "(//div[*='Help'])[1]")
        public WebElement Help_btn;

        @FindBy(xpath = "//span[text()='Visit the Help Center']")
        public WebElement HelpCenter_btn;

        @FindBy(xpath = "(//div[text()='Read more'])[1]")
        public WebElement ReadMore_btn;

        @FindBy(id = "FMP-target")
        public WebElement Verifies_Coronavirus_Title;
}
