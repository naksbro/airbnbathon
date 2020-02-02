package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class BookPage {
    private static WebDriver driver = Driver.getDriver();
    public BookPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath="//input")
    public WebElement location;

    @FindBy (xpath="//input[@name='checkin']")
    public WebElement checkIn;

    @FindBy (xpath="//input[@name='checkout']")
    public WebElement checkOut;

    @FindBy (xpath = "//button[@class='_7ykwo4']")
    public WebElement guets;

    @FindBy (xpath = "//button[@class='_1vs0x720']")
    public WebElement searchBtn;



}
