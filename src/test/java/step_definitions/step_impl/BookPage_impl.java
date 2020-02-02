package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.BookPage;
import step_definitions.BookPage_STEPS;
import util.DateUtils;
import util.Driver;
import util.SeleniumUtils;

public class BookPage_impl {
    private static WebDriver driver = Driver.getDriver();
    BookPage bookPage = new BookPage();

    public void bookNow(String location, String guest) {
        SeleniumUtils.sendKeys(bookPage.location, location);
        SeleniumUtils.sendKeys(bookPage.checkIn, DateUtils.currentDateTime());
        SeleniumUtils.sendKeys(bookPage.checkOut, DateUtils.currentDatePlus(7));
        Select select = new Select(bookPage.guets);
        select.selectByVisibleText(guest);
        SeleniumUtils.click(bookPage.searchBtn);
    }
}
