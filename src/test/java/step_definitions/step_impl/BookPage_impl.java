package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.BookPage;
import util.Driver;
import util.SeleniumUtils;

public class BookPage_impl {
    private WebDriver driver = Driver.getDriver();
    BookPage bookPage = new BookPage();

    public void bookNow(String location, String guest) {
        SeleniumUtils.sendKeys(bookPage.location, location);
        bookPage.clickOut.click();
        SeleniumUtils.click(bookPage.checkInBox);
        SeleniumUtils.click(bookPage.checkIn);
        SeleniumUtils.click(bookPage.checkOutBox);
        SeleniumUtils.click(bookPage.checkOut);
        SeleniumUtils.click(bookPage.guets);
        for (int i = 0; i <= 4; i++) {
            SeleniumUtils.click(bookPage.addBtn);
        }
        bookPage.clickOut.click();
        SeleniumUtils.click(bookPage.searchBtn);
    }
}
