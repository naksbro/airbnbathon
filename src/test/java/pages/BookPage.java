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

    @FindBy (xpath="//*[@id=\"FMP-target\"]/div/div[1]/div/div/div/div/div/div[2]/div/form/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[2]/td[2]")
    public WebElement checkIn;

    @FindBy (xpath="//*[@id=\"FMP-target\"]/div/div[1]/div/div/div/div/div/div[2]/div/form/div[2]/div/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[2]")
    public WebElement checkOut;

    @FindBy (xpath = "//button[@class='_7ykwo4']")
    public WebElement guets;

    @FindBy (xpath = "//button[@class='_1vs0x720']")
    public WebElement searchBtn;



}
