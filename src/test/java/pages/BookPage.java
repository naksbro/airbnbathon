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

    @FindBy (xpath = "//*[@id=\"checkin_input\"]")
    public WebElement checkInBox;

    @FindBy (xpath="//*[@id=\"FMP-target\"]/div/div[1]/div/div/div/div/div/div[2]/div/form/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[2]/td[2]")
    public WebElement checkIn;

    @FindBy (xpath = "//*[@id=\"checkout_input\"]")
    public WebElement checkOutBox;

    @FindBy (xpath="//*[@id=\"FMP-target\"]/div/div[1]/div/div/div/div/div/div[2]/div/form/div[2]/div/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[2]")
    public WebElement checkOut;

    @FindBy (xpath = "//h1")
    public WebElement clickOut;

    @FindBy (xpath = "//button[@class='_7ykwo4']")
    public WebElement guets;

    @FindBy (xpath = "//*[@id=\"FMP-target\"]/div/div[1]/div/div/div/div/div/div[2]/div/form/div[3]/div/div[2]/div/div/div[1]/div[1]/div/div/div/div[2]/div/div[3]/button")
    public WebElement addBtn;

    @FindBy (xpath = "//button[@class='_1vs0x720']")
    public WebElement searchBtn;

    @FindBy (xpath = "//h3")
    public WebElement textVerif;



}
