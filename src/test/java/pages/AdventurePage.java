package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import java.util.List;

public class AdventurePage {

    private static WebDriver driver = Driver.getDriver();
    public AdventurePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[@class='_jhtq7hf']")
    public WebElement adventures_Btn;

    @FindBy (xpath = "//div[@id='FMP-target']/descendant::li[@class='_g86r3e']")
    public List<WebElement> under500;

}
